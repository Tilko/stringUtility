/*******************************************************************************
 * Copyright 2020 Grégoire Martinetti
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/
package api_global.strUtil;

import java.util.regex.Pattern;

public class StringRecog {
	private static Pattern lineTerminatorMatcher;
	public static Pattern getLineTerminatorMatcher() {
		if(lineTerminatorMatcher == null)
			lineTerminatorMatcher = Pattern.compile("(\r\n)|[\n\r\u0085\u2028\u2029]");
		return lineTerminatorMatcher;
	}
}
