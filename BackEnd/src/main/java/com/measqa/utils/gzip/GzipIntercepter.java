package com.measqa.utils.gzip;

import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.Provider;
import javax.ws.rs.ext.WriterInterceptor;
import javax.ws.rs.ext.WriterInterceptorContext;

@Provider // annotation to be automatically discovered by the JAX-RS
public class GzipIntercepter implements WriterInterceptor {

	public void aroundWriteTo(WriterInterceptorContext context) throws IOException, WebApplicationException {
		MultivaluedMap<String, Object> headers = context.getHeaders();
		headers.add(HttpHeaders.CONTENT_ENCODING, "gzip");
		final OutputStream outputStream = context.getOutputStream();
		context.setOutputStream(new GZIPOutputStream(outputStream));
		context.proceed();
	}

}
