package net.divine.hellocontroller;

import java.beans.PropertyEditorSupport;

public class StudentNameEditor extends PropertyEditorSupport {

	public void setAsText(String name) throws IllegalArgumentException {
		if (name.contains("Mr.") || name.contains("Ms.")) {
			setValue(name);
		} else {
			setValue("Mr." + name);
		}
	}
}
