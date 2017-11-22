/**
 * generated by Xtext 2.9.2
 */
package uam.eagledata.dsl.query.tests;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import query.QuerySet;
import uam.eagledata.dsl.query.tests.QueryDslInjectorProvider;

@RunWith(XtextRunner.class)
@InjectWith(QueryDslInjectorProvider.class)
@SuppressWarnings("all")
public class QueryDslParsingTest {
  @Inject
  private ParseHelper<QuerySet> parseHelper;
  
  @Test
  public void loadModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Hello Xtext!");
      _builder.newLine();
      final QuerySet result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}