import argparse
import os
import yaml

def create_model(template_path, output_path, wood_type, fruiting, config):
    if config['delete']:
        print(f"Deleting model: {output_path}")
        os.remove(output_path)
        return
    elif os.path.exists(output_path):
        print(f"Replacing model: {output_path}")
    else:
        print(f"Creating model: {output_path}")
    
    with open(template_path, 'r') as template_file:
        template_content = template_file.read()
        
    # Replace placeholders in template     
    template_content = template_content.replace("{wood_type}", wood_type)
    template_content = template_content.replace("{fruiting}", str(fruiting).lower())
    
    # Write the modified content to the output path
    with open(output_path, 'w') as output_file:
        output_file.write(template_content)

def process_woods(yaml_file, output_dir, template_dir, config):
    with open(yaml_file, 'r') as file:
        woods = yaml.safe_load(file)['woods']
    
    with open(config, 'r') as file:
        config = yaml.safe_load(file)['wood_model_creator']
    
    model_types = [
        "stairs", "stairs_inner", "stairs_outer",
        "slab_top", "slab",
        "log", "log_horizontal", "log_stripped", "log_horizontal_stripped",
        "fence_inventory", "fence_post", "fence_side",
        "fence_gate_open", "fence_gate_wall", "fence_gate_wall_open", "fence_gate",
        "trapdoor_bottom", "trapdoor_top", "trapdoor_open",
        "door_top_left", "door_top_right", "door_bottom_left", "door_bottom_right",
        "door_top_left_open", "door_top_right_open", "door_bottom_left_open", "door_bottom_right_open",
        "pressure_plate", "pressure_plate_down",
        "button", "button_pressed", "button_inventory",
        "sapling", "sign", "hanging_sign",
        "wood", "wood_stripped",
        "planks"
    ]
    
    fruiting_leaf_types = ["leaves_stage_0", "leaves_stage_1", "leaves_stage_2"]
    non_fruiting_leaf_type = "leaves_stage_0"
    
    if not os.path.exists(output_dir):
        os.makedirs(output_dir)

    for wood in woods:
        for wood_type, fruiting in wood.items():
            if not os.path.exists(output_dir):
                os.makedirs(output_dir)
            
            for model_type in model_types:
                template_path = os.path.join(template_dir, f"{model_type}.json")
                output_path = os.path.join(output_dir, f"{wood_type}_{model_type}.json")
                create_model(template_path, output_path, wood_type, fruiting, config)

            # Generate leaves based on fruiting state
            if fruiting:
                for model_type in fruiting_leaf_types:
                    template_path = os.path.join(template_dir, f"{model_type}.json")
                    output_path = os.path.join(output_dir, f"{wood_type}_{model_type}.json")
                    create_model(template_path, output_path, wood_type, fruiting, config)
            else:
                template_path = os.path.join(template_dir, f"{non_fruiting_leaf_type}.json")
                output_path = os.path.join(output_dir, f"{wood_type}_{non_fruiting_leaf_type}.json")
                create_model(template_path, output_path, wood_type, fruiting, config)

if __name__ == "__main__":
    parser = argparse.ArgumentParser(description="Generate wood models.")
    parser.add_argument('yaml_file', type=str, help='Path to the YAML file.')
    parser.add_argument('output_dir', type=str, help='Directory where models will be output.')
    parser.add_argument('template_dir', type=str, help='Directory containing model templates.')
    parser.add_argument('config', type=str, help='Config file for this script\'s non-command line argument settings.')
    
    args = parser.parse_args()
    
    process_woods(args.yaml_file, args.output_dir, args.template_dir, args.config)
