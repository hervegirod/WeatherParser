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
package ca.braunit.weatherparser.taf.util;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ca.braunit.weatherparser.exception.DecoderException;
import ca.braunit.weatherparser.taf.ExampleMessagesTaf;
import ca.braunit.weatherparser.taf.TafDecoder;
import ca.braunit.weatherparser.taf.domain.Taf;

public class WindDecoderTest {
	
	@Test
	/**
	 * Check Validity Period Decoding
	 * 
	 * @throws DecoderException
	 */
	public void testValidityPeriod() throws DecoderException {
		Taf taf = TafDecoder.decodeTaf(ExampleMessagesTaf.TAF_EXAMPLE_1);
		assertEquals("KT", taf.getWind().getSpeedUnitOfMeasure());
		assertEquals(350, taf.getWind().getWindDirection().intValue());
		assertEquals(5, taf.getWind().getWindSpeed().intValue());
	}

}