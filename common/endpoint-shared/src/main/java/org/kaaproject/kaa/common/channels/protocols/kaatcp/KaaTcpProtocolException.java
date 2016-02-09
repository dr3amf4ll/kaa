/**
 *  Copyright 2014-2016 CyberVision, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.kaaproject.kaa.common.channels.protocols.kaatcp;

/**
 * KaatcpProtocolExeption Class.
 * Used to indicate protocol parsing exceptions.
 * @author Andrey Panasenko apanasenko@cybervisiontech.com
 *
 */
public class KaaTcpProtocolException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = 4989380711384492851L;

    /**
     * Default constructor with error message
     * @param string the string
     */
    public KaaTcpProtocolException(String string) {
        super(string);
    }

}
