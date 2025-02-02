package de.melanx.MoreVanillaTools.config.mapper;

import com.google.gson.JsonPrimitive;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import org.moddingx.libx.annotation.config.RegisterMapper;
import org.moddingx.libx.config.gui.ConfigEditor;
import org.moddingx.libx.config.gui.InputProperties;
import org.moddingx.libx.config.mapper.ValueMapper;
import org.moddingx.libx.config.validator.ValidatorInfo;
import org.moddingx.libx.util.Misc;

@RegisterMapper
public class TagKeyMapper implements ValueMapper<TagKey<Block>, JsonPrimitive> {

    private static final InputProperties<TagKey<Block>> INPUT = new InputProperties<>() {

        @Override
        public TagKey<Block> defaultValue() {
            return TagKeyMapper.getTagKey(Misc.MISSINGNO);
        }

        @Override
        public boolean canInputChar(char chr) {
            return ResourceLocation.isAllowedInResourceLocation(chr);
        }

        @Override
        public boolean isValid(String str) {
            return ResourceLocation.tryParse(str) != null;
        }

        @Override
        public TagKey<Block> valueOf(String str) {
            return TagKeyMapper.getTagKey(str);
        }

        @Override
        public String toString(TagKey<Block> levelTagKey) {
            return levelTagKey.location().toString();
        }
    };

    @Override
    public TagKey<Block> fromJson(JsonPrimitive json) {
        return TagKeyMapper.getTagKey(json.getAsString());
    }

    @Override
    public JsonPrimitive toJson(TagKey<Block> value) {
        return new JsonPrimitive(value.location().toString());
    }

    @Override
    public ConfigEditor<TagKey<Block>> createEditor(ValidatorInfo<?> validator) {
        return ConfigEditor.input(INPUT, validator);
    }

    @Override
    public Class<TagKey<Block>> type() {
        //noinspection unchecked
        return (Class<TagKey<Block>>) (Class<?>) TagKey.class;
    }

    @Override
    public Class<JsonPrimitive> element() {
        return JsonPrimitive.class;
    }

    private static TagKey<Block> getTagKey(String str) {
        return TagKeyMapper.getTagKey(ResourceLocation.tryParse(str));
    }

    private static TagKey<Block> getTagKey(ResourceLocation location) {
        return TagKey.create(Registries.BLOCK, location);
    }
}
