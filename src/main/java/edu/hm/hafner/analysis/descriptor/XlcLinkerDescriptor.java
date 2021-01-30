package edu.hm.hafner.analysis.descriptor;

import edu.hm.hafner.analysis.parser.XlcLinkerParser;

/**
 * A Descriptor for the Xlc Linker parser.
 *
 * @author Lorenz Munsch
 */
class XlcLinkerDescriptor extends ParserDescriptor {

    private static final String ID = "xlc-linker";
    private static final String NAME = "IBM XLC Linker";

    /**
     * ctor for the abstract Parser Descriptor class.
     */
    XlcLinkerDescriptor() {
        super(ID, NAME, new XlcLinkerParser());
    }
}
