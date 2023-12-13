package io.github.mateuszuran.horustask;

import java.util.List;
import java.util.Optional;

public class Wall implements Structure, CompositeBlock {
    private List<Block> blocks;

    @Override
    public Optional<Block> findBlockByColor(String color) {
        return getBlocks().stream()
                .filter(block -> block.getColor().equalsIgnoreCase(color))
                .findAny();
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {
        return getBlocks().stream()
                .filter(block -> block.getMaterial().equalsIgnoreCase(material))
                .toList();
    }

    @Override
    public int count() {
        return getBlocks().size();
    }

    @Override
    public List<Block> getBlocks() {
        return this.blocks;
    }

    @Override
    public String getColor() {
        return getBlocks().stream()
                .findAny()
                .map(Block::getColor)
                .orElse(null);
    }

    @Override
    public String getMaterial() {
        return getBlocks().stream()
                .findAny()
                .map(Block::getColor)
                .orElse(null);
    }
}
