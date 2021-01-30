package edu.hm.hafner.analysis.descriptor;

import edu.hm.hafner.analysis.parser.GoLintParser;

/**
 * A Descriptor for the Go Lint parser.
 *
 * @author Lorenz Munsch
 */
class GoLintDescriptor extends ParserDescriptor {

    private static final String ID = "golint";
    private static final String NAME = "Go Lint";

    /**
     * ctor for the abstract Parser Descriptor class.
     */
    GoLintDescriptor() {
        super(ID, NAME, new GoLintParser());
    }
}
