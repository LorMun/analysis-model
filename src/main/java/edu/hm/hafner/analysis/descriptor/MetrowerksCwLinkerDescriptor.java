package edu.hm.hafner.analysis.descriptor;

import edu.hm.hafner.analysis.parser.MetrowerksCwLinkerParser;

/**
 * A Descriptor for the Metrowerks Cw Linker parser.
 *
 * @author Lorenz Munsch
 */
class MetrowerksCwLinkerDescriptor extends ParserDescriptor {

    private static final String ID = "metrowerks-cw-linker";
    private static final String NAME = "MetrowerksCwLinker";

    /**
     * ctor for the abstract Parser Descriptor class.
     */
    MetrowerksCwLinkerDescriptor() {
        super(ID, NAME, new MetrowerksCwLinkerParser());
    }
}
