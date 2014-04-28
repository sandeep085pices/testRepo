package com.sd.first;

enum AEnum {

	JSON_SERIALIZATION_EXCEPTION("501", "Unable to serialize json"), JSON_DESERIALIZATION_EXCEPTION(
			"502", "Unable to deserialize json"), PROTOSTUFF_SERIALIZATION_EXCEPTION(
			"503", "Unable to serialize protostuff"), PROTOSTUFF_DESERIALIZATION_EXCEPTION(
			"504", "Unable to deserialize protostuff"), INSTANTIATION_EXCEPTION(
			"505",
			"Unable to initialise request/response class. May be zero argument constructor is missing."), IO_EXCEPTION(
			"506",
			"IO exception while creating object of request/response class.");

	private String code;
	private String description;

	private AEnum(String code, String description) {
		this.code = code;
		this.description = description;
	}

	public String code() {
		return this.code;
	}

	public String description() {
		return this.description;
	}

}

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AEnum a = AEnum.INSTANTIATION_EXCEPTION;
		System.out.println(a.code());
		System.out.println(AEnum.JSON_SERIALIZATION_EXCEPTION);
	}

}
