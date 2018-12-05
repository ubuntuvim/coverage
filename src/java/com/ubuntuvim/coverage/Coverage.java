package com.ubuntuvim.coverage;

/**
 * 覆盖率
 * 
 * @author ubuntuvim
 *
 */
public class Coverage {
	
	public String normal(int type) {
		if (type == 1) {
			return "one";
		} else {
			return "other";
		}
	}

	public int exceptMethod(int p) {
		p = (p + 10) / p;
		return p;
	}

	public int throwExcept(int p) throws MyException {
		try {
			p = (p + 10) / p;
		} catch (Exception e) {
			throw new MyException("0不能做分母。");
		}
		return p;
	}
}
