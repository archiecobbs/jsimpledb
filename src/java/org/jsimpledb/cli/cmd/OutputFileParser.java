
/*
 * Copyright (C) 2015 Archie L. Cobbs. All rights reserved.
 */

package org.jsimpledb.cli.cmd;

import java.io.File;

import org.jsimpledb.parse.ParseContext;
import org.jsimpledb.parse.ParseException;

class OutputFileParser extends AbstractFileParser {

    @Override
    protected boolean validateFile(File file, boolean complete) {
        return !file.isDirectory() && (file.exists() || !complete);
    }

    @Override
    protected ParseException createParseException(ParseContext ctx, File file) {
        return new ParseException(ctx, "can't write to file `" + file + "'");
    }
}

