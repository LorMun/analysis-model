package edu.hm.hafner.analysis.descriptor;

import edu.hm.hafner.analysis.parser.QacSourceCodeAnalyserParser;

/**
 * A Descriptor for the Qac Source Code Analyser parser.
 *
 * @author Lorenz Munsch
 */
class QacSourceCodeAnalyserDescriptor extends ParserDescriptor {

    private static final String ID = "qac";
    private static final String NAME = "QA-C Sourcecode Analyser";

    /**
     * ctor for the abstract Parser Descriptor class.
     */
    QacSourceCodeAnalyserDescriptor() {
        super(ID, NAME, new QacSourceCodeAnalyserParser());
    }
}
