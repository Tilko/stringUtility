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

import java.util.HashMap;
import java.util.Map;

import api_global.geom.dim1.Seg;

//StringGen.makeStrConcating(,);
public class StringGen {
	public static String makeStrConcating(int nb, String s){
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < nb; i++){
			sb.append(s);
		}
		return sb.toString();
	}
	public static String getSpaces(int spaceNb){
		return makeStrConcating(spaceNb, " ");
	}
	public static String substituteSegment(String original, String replacement, Seg segmentToReplace) {
		StringBuilder sb = new StringBuilder();
		sb.append(original.substring(0, segmentToReplace.getBeg()));
		sb.append(replacement);
		sb.append(original.substring(segmentToReplace.getEnd()));
		return sb.toString();
	}
	
	public static void appendTickList(StringBuilder sb, int indentOffset, String tick, String ... strings) {
		for(String str : strings) {
			sb.append(makeStrConcating(indentOffset, "    "));
			sb.append(tick);
			sb.append(str);
		}
	}
	
	public static String getCloserDelimiterOf(String leftDelimiter) {
		return leftToRightDelimiter.get(leftDelimiter);
	}
	
	protected final static Map<String, String> leftToRightDelimiter;
	static {
		leftToRightDelimiter = new HashMap<>();
		leftToRightDelimiter.put("(", ")");
		leftToRightDelimiter.put("[", "]");
		leftToRightDelimiter.put("{", "}");
		leftToRightDelimiter.put("<", ">");
		leftToRightDelimiter.put("\"", "\"");
		leftToRightDelimiter.put("'", "'");
		leftToRightDelimiter.put("|", "|");
		leftToRightDelimiter.put("```", "```");
		leftToRightDelimiter.put("/", "\\");
		leftToRightDelimiter.put("\\", "/");
	}
}
