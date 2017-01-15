package com.measqa.utils;

import java.util.List;
import java.util.Map;

import javax.ws.rs.core.UriInfo;

public class JerseyUtils {

	public static int getValueFromRequest(UriInfo info, String desiredKey, int defaultValueIfNot) {
		Map<String, List<String>> params = info.getQueryParameters();
		if (!params.containsKey(desiredKey)) {
			return defaultValueIfNot;
		} else {
			String value = params.get(desiredKey).get(0);
			try {
				return Integer.parseInt(value);
			} catch (NumberFormatException ex) {
				return defaultValueIfNot;
			}
		}

	}
}
