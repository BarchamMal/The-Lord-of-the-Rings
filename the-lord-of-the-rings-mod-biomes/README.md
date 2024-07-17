# This is the Lord of The Rings Mod: Biomes

In this mod I will be adding crops, saplings, flowers, trees, ores, biomes, etc, which are part of my  LoTR project.

Currently, I've added:
- A script to create all the wood-related models
- All plum tree textures
- All olive tree textures
- Athelas textures

## About contributing

I use GIMP ([GNU Image Manipulation Program](gimp.org)) and [Blockbench](blockbench.net) (Well actually, I haven't used blockbench in this project yet, all the models were made with code) to create the models and textures.
If you have gimp, you will notice I have some files saved in gimp's format `.xcf` if they end with `_leaves.xcf` or `_log.xcf` they are the files containing the data for leaves and logs which can be **easily modified at any time**.
The textures that will need created per tree are as follows:
 - <wood_name>_door_bottom
 - <wood_name>_door_top
 - <wood_name>_log_side_stripped
 - <wood_name>_log_side
 - <wood_name>_log_top_stripped
 - <wood_name>_log_top
 - <wood_name>_planks
 - <wood_name>_sapling
 - <wood_name>_trapdoor
 - <wood_name>_leaves

And if it's a fruiting tree as defined by a true in the `woods.yaml` file:
 - <wood_name>_leaves_flowering
 - <wood_name>_leaves_fruiting
