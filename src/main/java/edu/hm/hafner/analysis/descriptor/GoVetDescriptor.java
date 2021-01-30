package edu.hm.hafner.analysis.descriptor;

import edu.hm.hafner.analysis.parser.GoVetParser;

/**
 * A Descriptor for the Go Lint parser.
 *
 * @author Lorenz Munsch
 */
class GoVetDescriptor extends ParserDescriptor {

    private static final String ID = "go-vet";
    private static final String NAME = "Go Vet";

    /**
     * ctor for the abstract Parser Descriptor class.
     */
    GoVetDescriptor() {
        super(ID, NAME, new GoVetParser());
    }
}
