// Generated from com/antlr/demoantlr/Cddl.g4 by ANTLR 4.10.1
package com.antlr.demoantlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CddlParser}.
 */
public interface CddlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CddlParser#cddl}.
	 * @param ctx the parse tree
	 */
	void enterCddl(CddlParser.CddlContext ctx);
	/**
	 * Exit a parse tree produced by {@link CddlParser#cddl}.
	 * @param ctx the parse tree
	 */
	void exitCddl(CddlParser.CddlContext ctx);
	/**
	 * Enter a parse tree produced by {@link CddlParser#typename}.
	 * @param ctx the parse tree
	 */
	void enterTypename(CddlParser.TypenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CddlParser#typename}.
	 * @param ctx the parse tree
	 */
	void exitTypename(CddlParser.TypenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CddlParser#groupname}.
	 * @param ctx the parse tree
	 */
	void enterGroupname(CddlParser.GroupnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CddlParser#groupname}.
	 * @param ctx the parse tree
	 */
	void exitGroupname(CddlParser.GroupnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CddlParser#assignt}.
	 * @param ctx the parse tree
	 */
	void enterAssignt(CddlParser.AssigntContext ctx);
	/**
	 * Exit a parse tree produced by {@link CddlParser#assignt}.
	 * @param ctx the parse tree
	 */
	void exitAssignt(CddlParser.AssigntContext ctx);
	/**
	 * Enter a parse tree produced by {@link CddlParser#assigng}.
	 * @param ctx the parse tree
	 */
	void enterAssigng(CddlParser.AssigngContext ctx);
	/**
	 * Exit a parse tree produced by {@link CddlParser#assigng}.
	 * @param ctx the parse tree
	 */
	void exitAssigng(CddlParser.AssigngContext ctx);
	/**
	 * Enter a parse tree produced by {@link CddlParser#genericparm}.
	 * @param ctx the parse tree
	 */
	void enterGenericparm(CddlParser.GenericparmContext ctx);
	/**
	 * Exit a parse tree produced by {@link CddlParser#genericparm}.
	 * @param ctx the parse tree
	 */
	void exitGenericparm(CddlParser.GenericparmContext ctx);
	/**
	 * Enter a parse tree produced by {@link CddlParser#genericarg}.
	 * @param ctx the parse tree
	 */
	void enterGenericarg(CddlParser.GenericargContext ctx);
	/**
	 * Exit a parse tree produced by {@link CddlParser#genericarg}.
	 * @param ctx the parse tree
	 */
	void exitGenericarg(CddlParser.GenericargContext ctx);
	/**
	 * Enter a parse tree produced by {@link CddlParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CddlParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CddlParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CddlParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CddlParser#type1}.
	 * @param ctx the parse tree
	 */
	void enterType1(CddlParser.Type1Context ctx);
	/**
	 * Exit a parse tree produced by {@link CddlParser#type1}.
	 * @param ctx the parse tree
	 */
	void exitType1(CddlParser.Type1Context ctx);
	/**
	 * Enter a parse tree produced by {@link CddlParser#type2}.
	 * @param ctx the parse tree
	 */
	void enterType2(CddlParser.Type2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CddlParser#type2}.
	 * @param ctx the parse tree
	 */
	void exitType2(CddlParser.Type2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CddlParser#rangeop}.
	 * @param ctx the parse tree
	 */
	void enterRangeop(CddlParser.RangeopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CddlParser#rangeop}.
	 * @param ctx the parse tree
	 */
	void exitRangeop(CddlParser.RangeopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CddlParser#ctlop}.
	 * @param ctx the parse tree
	 */
	void enterCtlop(CddlParser.CtlopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CddlParser#ctlop}.
	 * @param ctx the parse tree
	 */
	void exitCtlop(CddlParser.CtlopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CddlParser#group}.
	 * @param ctx the parse tree
	 */
	void enterGroup(CddlParser.GroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CddlParser#group}.
	 * @param ctx the parse tree
	 */
	void exitGroup(CddlParser.GroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CddlParser#grpchoice}.
	 * @param ctx the parse tree
	 */
	void enterGrpchoice(CddlParser.GrpchoiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CddlParser#grpchoice}.
	 * @param ctx the parse tree
	 */
	void exitGrpchoice(CddlParser.GrpchoiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CddlParser#grpent}.
	 * @param ctx the parse tree
	 */
	void enterGrpent(CddlParser.GrpentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CddlParser#grpent}.
	 * @param ctx the parse tree
	 */
	void exitGrpent(CddlParser.GrpentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CddlParser#memberkey}.
	 * @param ctx the parse tree
	 */
	void enterMemberkey(CddlParser.MemberkeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CddlParser#memberkey}.
	 * @param ctx the parse tree
	 */
	void exitMemberkey(CddlParser.MemberkeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CddlParser#bareword}.
	 * @param ctx the parse tree
	 */
	void enterBareword(CddlParser.BarewordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CddlParser#bareword}.
	 * @param ctx the parse tree
	 */
	void exitBareword(CddlParser.BarewordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CddlParser#optcom}.
	 * @param ctx the parse tree
	 */
	void enterOptcom(CddlParser.OptcomContext ctx);
	/**
	 * Exit a parse tree produced by {@link CddlParser#optcom}.
	 * @param ctx the parse tree
	 */
	void exitOptcom(CddlParser.OptcomContext ctx);
	/**
	 * Enter a parse tree produced by {@link CddlParser#occur}.
	 * @param ctx the parse tree
	 */
	void enterOccur(CddlParser.OccurContext ctx);
	/**
	 * Exit a parse tree produced by {@link CddlParser#occur}.
	 * @param ctx the parse tree
	 */
	void exitOccur(CddlParser.OccurContext ctx);
	/**
	 * Enter a parse tree produced by {@link CddlParser#uint_1}.
	 * @param ctx the parse tree
	 */
	void enterUint_1(CddlParser.Uint_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link CddlParser#uint_1}.
	 * @param ctx the parse tree
	 */
	void exitUint_1(CddlParser.Uint_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link CddlParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(CddlParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CddlParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(CddlParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CddlParser#int_1}.
	 * @param ctx the parse tree
	 */
	void enterInt_1(CddlParser.Int_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link CddlParser#int_1}.
	 * @param ctx the parse tree
	 */
	void exitInt_1(CddlParser.Int_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link CddlParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(CddlParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CddlParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(CddlParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link CddlParser#hexfloat}.
	 * @param ctx the parse tree
	 */
	void enterHexfloat(CddlParser.HexfloatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CddlParser#hexfloat}.
	 * @param ctx the parse tree
	 */
	void exitHexfloat(CddlParser.HexfloatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CddlParser#fraction}.
	 * @param ctx the parse tree
	 */
	void enterFraction(CddlParser.FractionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CddlParser#fraction}.
	 * @param ctx the parse tree
	 */
	void exitFraction(CddlParser.FractionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CddlParser#exponent}.
	 * @param ctx the parse tree
	 */
	void enterExponent(CddlParser.ExponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CddlParser#exponent}.
	 * @param ctx the parse tree
	 */
	void exitExponent(CddlParser.ExponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CddlParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(CddlParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link CddlParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(CddlParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link CddlParser#schar}.
	 * @param ctx the parse tree
	 */
	void enterSchar(CddlParser.ScharContext ctx);
	/**
	 * Exit a parse tree produced by {@link CddlParser#schar}.
	 * @param ctx the parse tree
	 */
	void exitSchar(CddlParser.ScharContext ctx);
	/**
	 * Enter a parse tree produced by {@link CddlParser#sesc}.
	 * @param ctx the parse tree
	 */
	void enterSesc(CddlParser.SescContext ctx);
	/**
	 * Exit a parse tree produced by {@link CddlParser#sesc}.
	 * @param ctx the parse tree
	 */
	void exitSesc(CddlParser.SescContext ctx);
	/**
	 * Enter a parse tree produced by {@link CddlParser#bytes}.
	 * @param ctx the parse tree
	 */
	void enterBytes(CddlParser.BytesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CddlParser#bytes}.
	 * @param ctx the parse tree
	 */
	void exitBytes(CddlParser.BytesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CddlParser#bchar}.
	 * @param ctx the parse tree
	 */
	void enterBchar(CddlParser.BcharContext ctx);
	/**
	 * Exit a parse tree produced by {@link CddlParser#bchar}.
	 * @param ctx the parse tree
	 */
	void exitBchar(CddlParser.BcharContext ctx);
	/**
	 * Enter a parse tree produced by {@link CddlParser#bsqual}.
	 * @param ctx the parse tree
	 */
	void enterBsqual(CddlParser.BsqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link CddlParser#bsqual}.
	 * @param ctx the parse tree
	 */
	void exitBsqual(CddlParser.BsqualContext ctx);
	/**
	 * Enter a parse tree produced by {@link CddlParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(CddlParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CddlParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(CddlParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CddlParser#alpha}.
	 * @param ctx the parse tree
	 */
	void enterAlpha(CddlParser.AlphaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CddlParser#alpha}.
	 * @param ctx the parse tree
	 */
	void exitAlpha(CddlParser.AlphaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CddlParser#ealpha}.
	 * @param ctx the parse tree
	 */
	void enterEalpha(CddlParser.EalphaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CddlParser#ealpha}.
	 * @param ctx the parse tree
	 */
	void exitEalpha(CddlParser.EalphaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CddlParser#digit}.
	 * @param ctx the parse tree
	 */
	void enterDigit(CddlParser.DigitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CddlParser#digit}.
	 * @param ctx the parse tree
	 */
	void exitDigit(CddlParser.DigitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CddlParser#digit1}.
	 * @param ctx the parse tree
	 */
	void enterDigit1(CddlParser.Digit1Context ctx);
	/**
	 * Exit a parse tree produced by {@link CddlParser#digit1}.
	 * @param ctx the parse tree
	 */
	void exitDigit1(CddlParser.Digit1Context ctx);
	/**
	 * Enter a parse tree produced by {@link CddlParser#hexdig}.
	 * @param ctx the parse tree
	 */
	void enterHexdig(CddlParser.HexdigContext ctx);
	/**
	 * Exit a parse tree produced by {@link CddlParser#hexdig}.
	 * @param ctx the parse tree
	 */
	void exitHexdig(CddlParser.HexdigContext ctx);
	/**
	 * Enter a parse tree produced by {@link CddlParser#bindig}.
	 * @param ctx the parse tree
	 */
	void enterBindig(CddlParser.BindigContext ctx);
	/**
	 * Exit a parse tree produced by {@link CddlParser#bindig}.
	 * @param ctx the parse tree
	 */
	void exitBindig(CddlParser.BindigContext ctx);
	/**
	 * Enter a parse tree produced by {@link CddlParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(CddlParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link CddlParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(CddlParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link CddlParser#ws}.
	 * @param ctx the parse tree
	 */
	void enterWs(CddlParser.WsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CddlParser#ws}.
	 * @param ctx the parse tree
	 */
	void exitWs(CddlParser.WsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CddlParser#sp}.
	 * @param ctx the parse tree
	 */
	void enterSp(CddlParser.SpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CddlParser#sp}.
	 * @param ctx the parse tree
	 */
	void exitSp(CddlParser.SpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CddlParser#nl}.
	 * @param ctx the parse tree
	 */
	void enterNl(CddlParser.NlContext ctx);
	/**
	 * Exit a parse tree produced by {@link CddlParser#nl}.
	 * @param ctx the parse tree
	 */
	void exitNl(CddlParser.NlContext ctx);
	/**
	 * Enter a parse tree produced by {@link CddlParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(CddlParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CddlParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(CddlParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CddlParser#pchar}.
	 * @param ctx the parse tree
	 */
	void enterPchar(CddlParser.PcharContext ctx);
	/**
	 * Exit a parse tree produced by {@link CddlParser#pchar}.
	 * @param ctx the parse tree
	 */
	void exitPchar(CddlParser.PcharContext ctx);
	/**
	 * Enter a parse tree produced by {@link CddlParser#crlf}.
	 * @param ctx the parse tree
	 */
	void enterCrlf(CddlParser.CrlfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CddlParser#crlf}.
	 * @param ctx the parse tree
	 */
	void exitCrlf(CddlParser.CrlfContext ctx);
}