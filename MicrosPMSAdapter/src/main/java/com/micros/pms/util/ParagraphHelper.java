package com.micros.pms.util;

import com.cloudkey.pms.micros.og.common.Text;
import com.cloudkey.pms.micros.og.hotelcommon.ObjectFactory;
import com.cloudkey.pms.micros.og.hotelcommon.Paragraph;
import com.google.common.collect.Lists;

import javax.xml.bind.JAXBElement;
import java.util.ArrayList;
import java.util.List;

/**
 * The {@link com.cloudkey.pms.micros.og.hotelcommon.Paragraph} jaxb class contains a list of
 * {@link javax.xml.bind.JAXBElement}s, which are not the easiest to work with.
 *
 * This provides helpers for reading Paragraphs.
 *
 * @see {@link com.cloudkey.pms.micros.og.hotelcommon.ObjectFactory#createParagraphImage(String)}
 * @see {@link com.cloudkey.pms.micros.og.hotelcommon.ObjectFactory#createParagraphText(com.cloudkey.pms.micros.og.common.Text)}
 * @see {@link com.cloudkey.pms.micros.og.hotelcommon.ObjectFactory#createParagraphURL(String)}
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class ParagraphHelper {

	private final static ObjectFactory FACTORY = new ObjectFactory();

	public static List<Text> getTextList(Paragraph paragraph) {
		return getTextList(paragraph.getImagesAndURLSAndTexts());
	}

	public static List<Text> getTextList(List<JAXBElement<?>> elements) {
		List<Text> textList = Lists.newArrayList();

		for (JAXBElement<?> jaxbElement : elements) {
			if (jaxbElement.getDeclaredType().equals(Text.class)) {
				textList.add((Text) jaxbElement.getValue());
			}
		}

		return textList;
	}

	/**
	 * Syntactic sugar for creating a basic paragraph.
	 *
	 * @param string
	 * @return
	 */
	public static JAXBElement<Text> createParagraph(String string) {
		return FACTORY.createParagraphText(new Text(string, false, null));
	}
}
