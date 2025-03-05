import os
import json
import argparse

def find_and_add_tags(directory, find_str, replace_str):
    # Loop through all files in the directory
    for filename in os.listdir(directory):
        if filename.endswith(".json"):
            filepath = os.path.join(directory, filename)
            with open(filepath, 'r') as file:
                data = json.load(file)

            # Check if "values" key exists and is a list
            if "values" in data and isinstance(data["values"], list):
                modified = False
                new_values = data["values"].copy()

                for item in data["values"]:
                    if isinstance(item, str) and find_str in item:
                        new_item = item.replace(find_str, replace_str)
                        if new_item not in data["values"]:  # Check for duplicates
                            new_values.append(new_item)  # Add modified item
                            print(f"Added {new_item} to {filename}.")
                            modified = True

                if modified:
                    data["values"] = new_values
                    with open(filepath, 'w') as file:
                        json.dump(data, file, indent=2)

if __name__ == "__main__":
    parser = argparse.ArgumentParser(description="Find and duplicate JSON values with string replacement.")
    parser.add_argument("directory", type=str, help="The directory containing the JSON files.")
    parser.add_argument("find_str", type=str, help="The string to find in the JSON values.")
    parser.add_argument("replace_str", type=str, help="The string to replace the found string with.")

    args = parser.parse_args()

    find_and_add_tags(args.directory, args.find_str, args.replace_str)