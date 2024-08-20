import argparse
import yaml
import os

def load_yaml(file_path):
    """Load and return the content of a YAML file."""
    with open(file_path, 'r') as file:
        return yaml.safe_load(file)

def write_model(output_path, content):
    """Write content to a file and log the action."""
    if os.path.exists(output_path):
        print(f"Replacing model: {output_path}")
    else:
        print(f"Creating model: {output_path}")
    with open(output_path, 'w') as file:
        file.write(content)

def generate_item_models(woods_file, items_file, output_dir):
    """Generate item models for wood types based on the provided YAML files."""
    # Load YAML files
    with open(woods_file, 'r') as file:
        woods = yaml.safe_load(file)['woods']

    with open(items_file, 'r') as file:
        items = yaml.safe_load(file)

    # Create output directory if it doesn't exist
    os.makedirs(output_dir, exist_ok=True)

    # Templates for the item models, with escaped curly braces
    flat_template = '''{{
      "parent": "minecraft:item/generated",
      "textures": {{
        "layer0": "{texture}"
      }}
    }}
    '''

    block_template = '''{{
      "parent": "{model}"
    }}
    '''

    # Generate JSON files
    for wood in woods:
        wood_type = list(wood.keys())[0]
        print(f"Processing wood type: {wood_type}")

        # Generate flat items
        for flat_item in items['flats']:
            if isinstance(flat_item, dict):
                item_name = list(flat_item.keys())[0]
                custom_texture = flat_item[item_name].get('texture', None)
            else:
                item_name = flat_item
                custom_texture = None

            texture = custom_texture.format(wood_type=wood_type) if custom_texture else f"the-lord-of-the-rings-mod-biomes:item/{wood_type}_{item_name}"
            file_name = f"{wood_type}_{item_name}.json"
            content = flat_template.format(texture=texture)
            write_model(os.path.join(output_dir, file_name), content)

        # Generate block items
        for block_item in items['blocks']:
            if isinstance(block_item, dict):
                item_name = list(block_item.keys())[0]
                custom_model = block_item[item_name].get('model', None)
            else:
                item_name = block_item
                custom_model = None

            model = custom_model.format(wood_type=wood_type) if custom_model else f"the-lord-of-the-rings-mod-biomes:block/{wood_type}_{item_name}"
            file_name = f"{wood_type}_{item_name}.json"
            content = block_template.format(model=model)
            write_model(os.path.join(output_dir, file_name), content)
    
    print("Processing miscellaneous` items")
    # Generate non wood flat items
    for flat_item in items['custom_flats']:
        texture = f"the-lord-of-the-rings-mod-biomes:item/{flat_item}"
        file_name = f"{flat_item}.json"
        content = flat_template.format(texture=texture)
        write_model(os.path.join(output_dir, file_name), content)

if __name__ == "__main__":
    parser = argparse.ArgumentParser(description="Generate item models for wood types.")
    parser.add_argument('woods_file', type=str, help='Path to the woods.yaml file.')
    parser.add_argument('items_file', type=str, help='Path to the items.yaml file.')
    parser.add_argument('output_dir', type=str, help='Directory where models will be output.')

    args = parser.parse_args()
    generate_item_models(args.woods_file, args.items_file, args.output_dir)