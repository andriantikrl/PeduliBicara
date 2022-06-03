package com.pedulibicara.pedulibicara.data.local

import com.pedulibicara.pedulibicara.R
import com.pedulibicara.pedulibicara.data.model.ModuleCategory
import com.pedulibicara.pedulibicara.data.model.MenuCategory
import com.pedulibicara.pedulibicara.data.model.ModuleItem
import com.pedulibicara.pedulibicara.utils.Strings

object Data {

    fun getModuleCategory() : List<ModuleCategory> {
        return listOf(
            ModuleCategory(
                0,
                Strings.get(R.string.body_parts),
                Strings.get(R.string.body_parts_description),
                MODULE_BODY_PARTS
            ),
            ModuleCategory(
                0,
                Strings.get(R.string.food),
                Strings.get(R.string.food_description),
                MODULE_FOOD
            ),
            ModuleCategory(
                0,
                Strings.get(R.string.animals),
                Strings.get(R.string.animals_description),
                MODULE_ANIMALS
            )
        )
    }

    fun getMenuCategory() : Map<String, MenuCategory> {
        return mapOf(
            MENU_MODULE to MenuCategory(
                0,
                Strings.get(R.string.module),
                Strings.get(R.string.module_description)
            ),
            MENU_GUESS_CARD to MenuCategory(
                0,
                Strings.get(R.string.guess_card),
                Strings.get(R.string.guess_card_description)
            ),
            MENU_GUESS_VOICE to MenuCategory(
                0,
                Strings.get(R.string.guess_voice),
                Strings.get(R.string.guess_voice_description)
            )
        )
    }

    fun getModuleItem(category: String) : List<ModuleItem> {
        val listModuleItem = mutableListOf<ModuleItem>()

        for (item in getAllModuleItem()) {
            if (item.category == category) {
                listModuleItem.add(item)
            }
        }

        return listModuleItem
    }

    fun getAllModuleItem() = listOf(
        ModuleItem(
            MODULE_BODY_PARTS,
            Strings.get(R.string."kepala"),
            0,
            0
        ),
        ModuleItem(
            MODULE_BODY_PARTS,
            Strings.get(R.string."bibir"),
            0,
            0
        ),
        ModuleItem(
            MODULE_BODY_PARTS,
            Strings.get(R.string."Mata"),
            0,
            0
        ),
        ModuleItem(
            MODULE_BODY_PARTS,
            Strings.get(R.string."dahi"),
            0,
            0
        ),
        ModuleItem(
            MODULE_BODY_PARTS,
            Strings.get(R.string."hidung"),
            0,
            0
        ),
        ModuleItem(
            MODULE_BODY_PARTS,
            Strings.get(R.string."jari"),
            0,
            0
        ),
        ModuleItem(
            MODULE_BODY_PARTS,
            Strings.get(R.string."kuku"),
            0,
            0
        ),
        ModuleItem(
            MODULE_BODY_PARTS,
            Strings.get(R.string."lengan"),
            0,
            0
        ),
        ModuleItem(
            MODULE_BODY_PARTS,
            Strings.get(R.string."lidah"),
            0,
            0
        ),
        ModuleItem(
            MODULE_BODY_PARTS,
            Strings.get(R.string."mulut"),
            0,
            0
        ),
        ModuleItem(
            MODULE_BODY_PARTS,
            Strings.get(R.string."pinggang"),
            0,
            0
        ),
        ModuleItem(
            MODULE_BODY_PARTS,
            Strings.get(R.string."pundak"),
            0,
            0
        ),
        ModuleItem(
            MODULE_BODY_PARTS,
            Strings.get(R.string."rambut"),
            0,
            0

    )
        fun getAllModuleItem() = listOf(
            ModuleItem(
                MODULE_FOOD,
                Strings.get(R.string."anggur"),
                0,
                0
            ),
            ModuleItem(
                MODULE_FOOD,
                Strings.get(R.string."apel"),
                0,
                0
            ),
            ModuleItem(
                MODULE_FOOD,
                Strings.get(R.string."bubur"),
                0,
                0
            ),
            ModuleItem(
                MODULE_FOOD,
                Strings.get(R.string."eskrim"),
                0,
                0
            ),
            ModuleItem(
                MODULE_FOOD,
                Strings.get(R.string."jeruk"),
                0,
                0
            ),
            ModuleItem(
                MODULE_FOOD,
                Strings.get(R.string."mangga"),
                0,
                0
            ),
            ModuleItem(
                MODULE_FOOD,
                Strings.get(R.string."melon"),
                0,
                0
            ),
            ModuleItem(
                MODULE_FOOD,
                Strings.get(R.string."nanas"),
                0,
                0
            ),
            ModuleItem(
                MODULE_FOOD,
                Strings.get(R.string."nasi"),
                0,
                0
            ),
            ModuleItem(
                MODULE_FOOD,
                Strings.get(R.string."nasiG"),
                0,
                0
            ),
            ModuleItem(
                MODULE_FOOD,
                Strings.get(R.string."pepaya"),
                0,
                0
            ),
            ModuleItem(
                MODULE_FOOD,
                Strings.get(R.string."sate"),
                0,
                0
            ),
            ModuleItem(
                MODULE_FOOD,
                Strings.get(R.string."semangka"),
                0,
                0
            ),
            ModuleItem(
                MODULE_FOOD,
                Strings.get(R.string."sereal"),
                0,
                0
            ),
            ModuleItem(
                MODULE_FOOD,
                Strings.get(R.string."telur"),
                0,
                0
            )
        )
            fun getAllModuleItem() = listOf(
                ModuleItem(
                    MODULE_ANIMALS,
                    Strings.get(R.string."anjing"),
                    0,
                    0
                ),
                ModuleItem(
                    MODULE_ANIMALS,
                    Strings.get(R.string."ayam"),
                    0,
                    0
                ),
                ModuleItem(
                    MODULE_ANIMALS,
                    Strings.get(R.string."bebek"),
                    0,
                    0
                ),
                ModuleItem(
                    MODULE_ANIMALS,
                    Strings.get(R.string."buaya"),
                    0,
                    0
                ),
                ModuleItem(
                    MODULE_ANIMALS,
                    Strings.get(R.string."cicak"),
                    0,
                    0
                ),
                ModuleItem(
                    MODULE_ANIMALS,
                    Strings.get(R.string."harimau"),
                    0,
                    0
                ),

                ModuleItem(
                    MODULE_ANIMALS,
                    Strings.get(R.string."ikan"),
                    0,
                    0
                ),
                ModuleItem(
                    MODULE_ANIMALS,
                    Strings.get(R.string."jerapah"),
                    0,
                    0
                ),
                ModuleItem(
                    MODULE_ANIMALS,
                    Strings.get(R.string."kambing"),
                    0,
                    0
                ),
                ModuleItem(
                    MODULE_ANIMALS,
                    Strings.get(R.string."kangguru"),
                    0,
                    0
                ),
                ModuleItem(
                    MODULE_ANIMALS,
                    Strings.get(R.string."kelinci"),
                    0,
                    0
                ),
                ModuleItem(
                    MODULE_ANIMALS,
                    Strings.get(R.string."kepiting"),
                    0,
                    0
                ),
                ModuleItem(
                    MODULE_ANIMALS,
                    Strings.get(R.string."kucing"),
                    0,
                    0
                ),
                ModuleItem(
                    MODULE_ANIMALS,
                    Strings.get(R.string."kupukupu"),
                    0,
                    0
                ),
                ModuleItem(
                    MODULE_ANIMALS,
                    Strings.get(R.string."nyamuk"),
                    0,
                    0
                ),
                ModuleItem(
                    MODULE_ANIMALS,
                    Strings.get(R.string."sapi"),
                    0,
                    0
                ),
                ModuleItem(
                    MODULE_ANIMALS,
                    Strings.get(R.string."semut"),
                    0,
                    0
                ),
                ModuleItem(
                    MODULE_ANIMALS,
                    Strings.get(R.string."ubur"),
                    0,
                    0




    const val MENU_MODULE = "menu_module"
    const val MENU_GUESS_CARD = "menu_guess_card"
    const val MENU_GUESS_VOICE = "menu_guess_voice"

    const val MODULE_BODY_PARTS = "module_body_parts"
    const val MODULE_FOOD = "module_food"
    const val MODULE_ANIMALS = "module_animals"
}