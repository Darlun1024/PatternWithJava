package com.wsj.pattern.memo;

public class MemoTest {

	public static void main(String[] args) {
			Svn svn = new Svn();
			Code code = new Code();
			code.appendCode("<Html>");
			code.appendCode("\n<Body>");
			svn.addVersion("第一版", code.createVersion());
			code.appendCode("\n<a>hello world!</a>");
			code.appendCode("\n</Body>");
			svn.addVersion("第二版", code.createVersion());
			code.appendCode("\n</Html>");
			svn.addVersion("第三版", code.createVersion());
			code.print();
			svn.log();
			code.restore(svn.getVersion(1));
			code.print();
	}

	
}
