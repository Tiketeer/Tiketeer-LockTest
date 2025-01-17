package com.tiketeer.Tiketeer.exception.code;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum MemberExceptionCode implements ExceptionCode {
	DUPLICATED_EMAIL(HttpStatus.BAD_REQUEST, "이미 존재하는 이메일입니다."),
	MEMBER_NOT_FOUND(HttpStatus.NOT_FOUND, "존재하지 않는 멤버입니다."),
	INVALID_NEW_PASSWORD(HttpStatus.CONFLICT, "동일한 비밀번호로 변경할 수 없습니다"),
	NOT_ENOUGH_POINT(HttpStatus.FORBIDDEN, "포인트 잔액이 부족합니다.");

	private final HttpStatus httpStatus;
	private final String message;
}
