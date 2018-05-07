Initial model and texture set up by Karen P, finished by Christen C. The stopwatch was removed from the finish line logo, it's now just flags. Here's info on related files

Skin 0 no color
Skin 1 blue
Skin 2 orange
Skin 3 two colors
(hlmv has the skins numbered from 1-4)

The default color on the model in the maya scene is no color, though the default color in the game is two colors

There’s a test map I use to check this in game where you can just walk straight across the map and through the exit to see the finish line outside of the exit door: map sp_a2_fizzler_intro_finish_line
These finish lines are used in the new dlc maps as well as most existing sp and coop maps

Here’s the command to change skins in game ent_fire finish_line skin 3 (or whatever color number you want to check)

Content:
portal2/staging/content/portal2_dlc1/materialsrc/models/props/stopwatch_finish_line/stopwatch_beam_lines.psd#2
portal2/staging/content/portal2_dlc1/materialsrc/models/props/stopwatch_finish_line/stopwatch_beam_lines_scale.tga#2

portal2/staging/content/portal2_dlc1/materialsrc/models/props/stopwatch_finish_line/stopwatch_finish_line.psd#3
(the photo shop includes a layer with the proportions of the Maya card model.)
portal2/staging/content/portal2_dlc1/materialsrc/models/props/stopwatch_finish_line/stopwatch_finish_line_2_colors.tga#3
portal2/staging/content/portal2_dlc1/materialsrc/models/props/stopwatch_finish_line/stopwatch_finish_line_blue.tga#3
portal2/staging/content/portal2_dlc1/materialsrc/models/props/stopwatch_finish_line/stopwatch_finish_line_no_color.tga#3
portal2/staging/content/portal2_dlc1/materialsrc/models/props/stopwatch_finish_line/stopwatch_finish_line_orange.tga#3

portal2\staging\content\portal2_dlc1\models\props\stopwatch_finish_line.qc
portal2\staging\content\portal2_dlc1\models\props\maya\stopwatch_finish_line.ma

Game:

portal2\staging\game\portal2_dlc1\models\props\stopwatch_finish_line.mdl

portal2/staging/game/portal2_dlc1/materials/models/props/stopwatch_finish_line/stopwatch_finish_line_2_colors.pwl.vtf#3
portal2/staging/game/portal2_dlc1/materials/models/props/stopwatch_finish_line/stopwatch_finish_line_2_colors.vmt#3
portal2/staging/game/portal2_dlc1/materials/models/props/stopwatch_finish_line/stopwatch_finish_line_2_colors.vtf#3

portal2/staging/game/portal2_dlc1/materials/models/props/stopwatch_finish_line/stopwatch_finish_line_blue.pwl.vtf#3
portal2/staging/game/portal2_dlc1/materials/models/props/stopwatch_finish_line/stopwatch_finish_line_blue.vmt#3
portal2/staging/game/portal2_dlc1/materials/models/props/stopwatch_finish_line/stopwatch_finish_line_blue.vtf#3

portal2/staging/game/portal2_dlc1/materials/models/props/stopwatch_finish_line/stopwatch_finish_line_no_color.pwl.vtf#3
portal2/staging/game/portal2_dlc1/materials/models/props/stopwatch_finish_line/stopwatch_finish_line_no_color.vmt#3
portal2/staging/game/portal2_dlc1/materials/models/props/stopwatch_finish_line/stopwatch_finish_line_no_color.vtf#3

portal2/staging/game/portal2_dlc1/materials/models/props/stopwatch_finish_line/stopwatch_finish_line_orange.pwl.vtf#3
portal2/staging/game/portal2_dlc1/materials/models/props/stopwatch_finish_line/stopwatch_finish_line_orange.vmt#3
portal2/staging/game/portal2_dlc1/materials/models/props/stopwatch_finish_line/stopwatch_finish_line_orange.vtf#3
