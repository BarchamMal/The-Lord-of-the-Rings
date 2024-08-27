import argparse
import os
import yaml

def create_blockstate(template_path, output_path, wood_type, config):
    if config['delete']:
        print(f"Deleting blockstate: {output_path}")
        os.remove(output_path)
        return
    elif os.path.exists(output_path):
        print(f"Replacing blockstate: {output_path}")
    else:
        print(f"Creating blockstate: {output_path}")
    
    with open(template_path, 'r') as template_file:
        template_content = template_file.read()
        
    # Replace placeholders in template
    template_content = template_content.replace("{wood_type}", wood_type)
    
    # Write the modified content to the output path
    with open(output_path, 'w') as output_file:
        output_file.write(template_content)

def process_woods(yaml_file, output_dir, template_dir, config):
    with open(yaml_file, 'r') as file:
        woods = yaml.safe_load(file)['woods']
    
    with open(config, 'r') as file:
        config = yaml.safe_load(file)['blockstate_creator']
    
    blockstate_types = [
        "button", "door", "fence_gate", "fence",
        "hanging_sign", "leaves", "log",
        "log_stripped", "planks", "pressure_plate",
        "sapling", "sign", "slab", "stairs",
        "trapdoor", "wall_hanging_sign", "wall_sign",
        "wood_stripped", "wood"
    ]
    
    if not os.path.exists(output_dir):
        os.makedirs(output_dir)

    for wood in woods:
        for wood_type, fruiting in wood.items():
            for blockstate_type in blockstate_types:
                template_name = f"{blockstate_type}.json"
                
                # Handle fruiting leaves differently
                if blockstate_type == "leaves" and fruiting:
                    template_name = "fruiting_leaves.json"
                
                template_path = os.path.join(template_dir, template_name)
                output_path = os.path.join(output_dir, f"{wood_type}_{blockstate_type}.json")
                create_blockstate(template_path, output_path, wood_type, config)

if __name__ == "__main__":
    parser = argparse.ArgumentParser(description="Generate wood block states.")
    parser.add_argument('yaml_file', type=str, help='Path to the YAML file.')
    parser.add_argument('output_dir', type=str, help='Directory where block states will be output.')
    parser.add_argument('template_dir', type=str, help='Directory containing block state templates.')
    parser.add_argument('config', type=str, help='Config file for this script\'s non-command line argument settings.')
    
    args = parser.parse_args()
    
    process_woods(args.yaml_file, args.output_dir, args.template_dir, args.config)