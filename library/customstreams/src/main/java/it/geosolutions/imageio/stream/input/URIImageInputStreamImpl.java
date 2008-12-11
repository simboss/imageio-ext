/*
 *    ImageI/O-Ext - OpenSource Java Image translation Library
 *    http://www.geo-solutions.it/
 *    https://imageio-ext.dev.java.net/
 *    (C) 2008, GeoSolutions
 *
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation;
 *    version 2.1 of the License.
 *
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 */
package it.geosolutions.imageio.stream.input;

import java.io.IOException;
import java.net.URI;

import javax.imageio.stream.ImageInputStreamImpl;

/**
 * @author Daniele Romagnoli, GeoSolutions
 * 
 * Note that this class doesn't actually allow read operations. It is actually
 * only used to allow defining an {@link ImageInputStream} referring to an URI.
 * 
 */
public class URIImageInputStreamImpl extends ImageInputStreamImpl implements
        URIImageInputStream {

    private URI uri;

    public int read() throws IOException {
        throw new UnsupportedOperationException(
                "read method is actually unsupported.");
    }

    public int read(byte[] b, int off, int len) throws IOException {
        throw new UnsupportedOperationException(
                "read method is actually unsupported.");
    }

    public URI getUri() {
        return uri;
    }

    public URIImageInputStreamImpl(final URI uri) {
        if (uri == null) {
            throw new NullPointerException("uri == null!");
        }
        this.uri = uri;
    }
}