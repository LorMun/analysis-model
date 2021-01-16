package edu.hm.hafner.analysis.descriptor;

import edu.hm.hafner.analysis.parser.dry.cpd.CpdParser;
import edu.hm.hafner.analysis.parser.dry.dupfinder.DupFinderParser;

/**
 * A Descriptor for the Dup Finder parser.
 *
 * @author Lorenz Munsch
 */
public class DupfinderDescriptor extends ParserDescriptor {

    private static final String ID = "dup_finder";
    private static final String NAME = "DupFinder";

    /**
     * ctor for the abstract Parser Descriptor class.
     */
    public DupfinderDescriptor() {
        super(ID, NAME, new DupFinderParser());
    }
}
