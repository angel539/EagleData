/*
 * generated by Xtext 2.9.2
 */
package uam.eagledata.dsl.annotations.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class AnnotationsDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("uam/eagledata/dsl/annotations/parser/antlr/internal/InternalAnnotationsDsl.tokens");
	}
}