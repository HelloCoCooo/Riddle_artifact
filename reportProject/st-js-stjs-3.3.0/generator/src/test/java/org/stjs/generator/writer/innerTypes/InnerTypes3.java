package org.stjs.generator.writer.innerTypes;

public class InnerTypes3 {
	class InnerType {
		public void innerMethod() {
		}
	}

	public void method() {
		new InnerTypes3.InnerType().innerMethod();
		InnerType x = new InnerType();
	}
}
