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

import api_global.geom.dim1.Seg;

public class StringFunctions {
	
	public static String getStrSeg(String str, Seg seg) {
		return str.substring(seg.getBeg(), seg.getEnd());
	}
	
	public static String capitalize(String str) {
		return str.substring(0,1).toUpperCase() + str.substring(1);
	}
	
	public static String getSimpleNameOfQualified(String qualifiedName) {
		int lastIndexOf = qualifiedName.lastIndexOf(".");
		return lastIndexOf == -1 ? qualifiedName : qualifiedName.substring(lastIndexOf+1);
	}

	public static String guil(String str) {
		return "\"" + str + "\"";
	}

//	public static int getStringHeight(String text, Font font){
//		return (int)(new TextLayout(text, font, frc).getBounds().getHeight());
//	}
//	public static int getStringHeight(String text, Font font){
//		return (int)(new TextLayout(text, font, frc).getBounds().getHeight());
//	}
}
