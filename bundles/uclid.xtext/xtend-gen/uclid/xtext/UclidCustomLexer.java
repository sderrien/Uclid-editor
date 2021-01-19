package uclid.xtext;

import com.google.common.base.Objects;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import uclid.xtext.parser.antlr.internal.InternalUclidLexer;

@SuppressWarnings("all")
public class UclidCustomLexer extends InternalUclidLexer {
  public UclidCustomLexer() {
  }
  
  public UclidCustomLexer(final CharStream input) {
    this(input, new RecognizerSharedState());
  }
  
  public UclidCustomLexer(final CharStream input, final RecognizerSharedState state) {
    super(input, state);
  }
  
  @Override
  public void mTokens() throws RecognitionException {
    int _LA = this.input.LA(1);
    String _string = new Character(((char) _LA)).toString();
    int _LA_1 = this.input.LA(2);
    String _string_1 = new Character(((char) _LA_1)).toString();
    String _plus = (_string + _string_1);
    int _LA_2 = this.input.LA(3);
    String _string_2 = new Character(((char) _LA_2)).toString();
    String _plus_1 = (_plus + _string_2);
    int _LA_3 = this.input.LA(4);
    String _string_3 = new Character(((char) _LA_3)).toString();
    final String str = (_plus_1 + _string_3);
    boolean _equals = Objects.equal(str, "<==>");
    if (_equals) {
      this.mRULE_LOGEQU();
    } else {
      boolean _equals_1 = Objects.equal(str, "==>");
      if (_equals_1) {
        this.mRULE_LOGIMPLY();
      } else {
        super.mTokens();
      }
    }
  }
}
