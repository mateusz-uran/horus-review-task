package io.github.mateuszuran.horustask;

import java.util.List;

public interface CompositeBlock extends Block {
    List<Block> getBlocks();
}
