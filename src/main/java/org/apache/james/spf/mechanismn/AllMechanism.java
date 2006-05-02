/***********************************************************************
 * Copyright (c) 1999-2006 The Apache Software Foundation.             *
 * All rights reserved.                                                *
 * ------------------------------------------------------------------- *
 * Licensed under the Apache License, Version 2.0 (the "License"); you *
 * may not use this file except in compliance with the License. You    *
 * may obtain a copy of the License at:                                *
 *                                                                     *
 *     http://www.apache.org/licenses/LICENSE-2.0                      *
 *                                                                     *
 * Unless required by applicable law or agreed to in writing, software *
 * distributed under the License is distributed on an "AS IS" BASIS,   *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or     *
 * implied.  See the License for the specific language governing       *
 * permissions and limitations under the License.                      *
 ***********************************************************************/

package org.apache.james.spf.mechanismn;

import org.apache.james.spf.Configurable;
import org.apache.james.spf.PermErrorException;
import org.apache.james.spf.SPF1Data;

import java.util.regex.MatchResult;

/**
 * This class represent the all mechanism
 * 
 * @author Norman Maurer <nm@byteaction.de>
 * 
 */
public class AllMechanism implements Mechanism, Configurable {

    public static final String REGEX = "[aA][lL][lL]";

    /**
     * @param spfData
     * @return
     * @throws PermErrorException
     */
    public boolean run(SPF1Data spfData) throws PermErrorException {
        return true;
    }

    public void config(MatchResult params) throws PermErrorException {
        // no checks needed
        // the regex only passes with no parameters
    }

}