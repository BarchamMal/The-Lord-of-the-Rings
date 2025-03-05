#!/bin/bash

################################################################################
# Script Name: run_scripts.sh
# Description: This script automates the process of creating models,
#             blockstates, and maybe more soon.
# Author: BarchamMal
# Date: 2024-08-14
# Version: 1.1
################################################################################

# Change directory to the location of the script
cd "${0%/*}"

echo "Starting Models:"
echo "-------------------------------------Wood Blocks-------------------------------------"
python3.11 src/main/resources/assets/the-lord-of-the-rings-mod-biomes/wood_type_scripts/wood_model_creator.py woods.yaml src/main/resources/assets/the-lord-of-the-rings-mod-biomes/models/block src/main/resources/assets/the-lord-of-the-rings-mod-biomes/wood_type_scripts/templates config.yaml
echo "-------------------------------------Wood Items-------------------------------------"
python3.11 src/main/resources/assets/the-lord-of-the-rings-mod-biomes/wood_type_scripts/wood_item_model_creator.py woods.yaml src/main/resources/assets/the-lord-of-the-rings-mod-biomes/wood_type_scripts/items.yaml src/main/resources/assets/the-lord-of-the-rings-mod-biomes/models/item config.yaml

echo "Starting Blockstates:"
echo "-------------------------------------Wood Blocks-------------------------------------"
python3.11 src/main/resources/assets/the-lord-of-the-rings-mod-biomes/blockstates/wood_type_scripts/blockstate_creator.py woods.yaml src/main/resources/assets/the-lord-of-the-rings-mod-biomes/blockstates src/main/resources/assets/the-lord-of-the-rings-mod-biomes/blockstates/wood_type_scripts/templates config.yaml
