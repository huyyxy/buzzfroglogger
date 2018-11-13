package com.github.huyyxy.buzzfroglogger;

import org.slf4j.Marker;

public class BuzzFrogLogger implements org.slf4j.Logger {

	private StringBuilder print(String arg0) {
		StringBuilder sb = new StringBuilder();
		sb.append(arg0);
		return sb;
	}
	
	private void debug(StringBuilder stringBuilder) {
		StringBuilder sb = new StringBuilder();
		sb.append("[debug]").append(stringBuilder);
		System.out.println(sb);
	}
	
	private void error(StringBuilder stringBuilder) {
		StringBuilder sb = new StringBuilder();
		sb.append("[error]").append(stringBuilder);
		System.out.println(sb);
	}
	
	private void info(StringBuilder stringBuilder) {
		StringBuilder sb = new StringBuilder();
		sb.append("[info]").append(stringBuilder);
		System.out.println(sb);
	}
	
	private void warn(StringBuilder stringBuilder) {
		StringBuilder sb = new StringBuilder();
		sb.append("[warn]").append(stringBuilder);
		System.out.println(sb);
	}
	
	private void trace(StringBuilder stringBuilder) {
		StringBuilder sb = new StringBuilder();
		sb.append("[trace]").append(stringBuilder);
		System.out.println(sb);
	}
	
	@Override
	public void debug(String arg0) {
		debug(print(arg0));
	}

	@Override
	public void debug(String arg0, Object arg1) {
		debug(print(arg0));
	}

	@Override
	public void debug(String arg0, Object... arg1) {
		debug(print(arg0));
	}

	@Override
	public void debug(String arg0, Throwable arg1) {
		debug(print(arg0));
	}

	@Override
	public void debug(Marker arg0, String arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(String arg0, Object arg1, Object arg2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Marker arg0, String arg1, Object arg2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Marker arg0, String arg1, Object... arg2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Marker arg0, String arg1, Throwable arg2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Marker arg0, String arg1, Object arg2, Object arg3) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(String arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(String arg0, Object arg1) {
		error(print(arg0));

	}

	@Override
	public void error(String arg0, Object... arg1) {
		error(print(arg0));

	}

	@Override
	public void error(String arg0, Throwable arg1) {
		error(print(arg0));

	}

	@Override
	public void error(Marker arg0, String arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(String arg0, Object arg1, Object arg2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Marker arg0, String arg1, Object arg2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Marker arg0, String arg1, Object... arg2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Marker arg0, String arg1, Throwable arg2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Marker arg0, String arg1, Object arg2, Object arg3) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void info(String arg0) {
		info(print(arg0));

	}

	@Override
	public void info(String arg0, Object arg1) {
		info(print(arg0));

	}

	@Override
	public void info(String arg0, Object... arg1) {
		info(print(arg0));

	}

	@Override
	public void info(String arg0, Throwable arg1) {
		info(print(arg0));

	}

	@Override
	public void info(Marker arg0, String arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(String arg0, Object arg1, Object arg2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Marker arg0, String arg1, Object arg2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Marker arg0, String arg1, Object... arg2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Marker arg0, String arg1, Throwable arg2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Marker arg0, String arg1, Object arg2, Object arg3) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isDebugEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isDebugEnabled(Marker arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isErrorEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isErrorEnabled(Marker arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isInfoEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isInfoEnabled(Marker arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isTraceEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isTraceEnabled(Marker arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isWarnEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isWarnEnabled(Marker arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void trace(String arg0) {
		trace(print(arg0));

	}

	@Override
	public void trace(String arg0, Object arg1) {
		trace(print(arg0));

	}

	@Override
	public void trace(String arg0, Object... arg1) {
		trace(print(arg0));

	}

	@Override
	public void trace(String arg0, Throwable arg1) {
		trace(print(arg0));

	}

	@Override
	public void trace(Marker arg0, String arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(String arg0, Object arg1, Object arg2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Marker arg0, String arg1, Object arg2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Marker arg0, String arg1, Object... arg2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Marker arg0, String arg1, Throwable arg2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Marker arg0, String arg1, Object arg2, Object arg3) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(String arg0) {
		warn(print(arg0));

	}

	@Override
	public void warn(String arg0, Object arg1) {
		warn(print(arg0));

	}

	@Override
	public void warn(String arg0, Object... arg1) {
		warn(print(arg0));

	}

	@Override
	public void warn(String arg0, Throwable arg1) {
		warn(print(arg0));

	}

	@Override
	public void warn(Marker arg0, String arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(String arg0, Object arg1, Object arg2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Marker arg0, String arg1, Object arg2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Marker arg0, String arg1, Object... arg2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Marker arg0, String arg1, Throwable arg2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Marker arg0, String arg1, Object arg2, Object arg3) {
		// TODO Auto-generated method stub

	}

}
