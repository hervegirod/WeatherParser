/*
 * Copyright (c)2014 Braun IT Solutions Ltd, Vancouver, Canada
 * http://www.braun-it.ca
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in 
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package ca.braunit.weatherparser.taf.domain;

import ca.braunit.weatherparser.common.domain.TimeInfo;

public class Temperature {

	private Integer temperature;
	private TimeInfo time;
	private boolean maximumTemperature = false;
	private boolean minimumTemperature = false;

	public Integer getTemperature() {
		return temperature;
	}
	public void setTemperature(Integer temperature) {
		this.temperature = temperature;
	}
	public TimeInfo getTime() {
		return time;
	}
	public void setTime(TimeInfo time) {
		this.time = time;
	}
	public boolean isMaximumTemperature() {
		return maximumTemperature;
	}
	public void setMaximumTemperature(boolean maximumTemperature) {
		this.maximumTemperature = maximumTemperature;
	}
	public boolean isMinimumTemperature() {
		return minimumTemperature;
	}
	public void setMinimumTemperature(boolean minimumTemperature) {
		this.minimumTemperature = minimumTemperature;
	}
	
}
