package org.stjs.generator.writer.statements;

import static org.stjs.javascript.JSCollections.$array;
import static org.stjs.javascript.JSGlobal.parseInt;

import org.stjs.javascript.Array;

public class Statements12 {

	public void method() {
		Array<Integer> a = $array(1, 2);
		for (String i : a) {
			int x = a.$get(i);
			parseInt(x);
		}

	}

}
