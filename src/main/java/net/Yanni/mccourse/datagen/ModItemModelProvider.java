package net.Yanni.mccourse.datagen;

import net.Yanni.mccourse.MCCourseMod;
import net.Yanni.mccourse.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MCCourseMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.RAW_BLACK_OPAL.get());
        basicItem(ModItems.BLACK_OPAL.get());
        basicItem(ModItems.CHAINSAW.get());
    }
}
