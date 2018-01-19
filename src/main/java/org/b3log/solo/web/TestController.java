package org.b3log.solo.web;

import org.b3log.latke.servlet.annotation.RequestProcessing;
import org.b3log.latke.servlet.annotation.RequestProcessor;

/**
 * Date: 19/01/2018
 *
 * @author zongqiang.hao
 */
@RequestProcessor
public class TestController {

	@RequestProcessing(value = "/test")
	public void print() {
		System.out.println(System.currentTimeMillis());
	}
}
