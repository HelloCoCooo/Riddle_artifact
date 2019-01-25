package org.stjs.generator.plugin.java8.writer.methodref;

import org.stjs.javascript.functions.Function2;

public class MethodRef2 {

	public int inc2(int i) {
		return i + 2;
	}

	private static int calculate(Function2<MethodRef2, Integer, Integer> f, MethodRef2 ref, int n) {
		return f.$invoke(ref, n);
	}

	public static int main(String[] args) {
		return calculate(MethodRef2::inc2, new MethodRef2(), 1);
	}
}
