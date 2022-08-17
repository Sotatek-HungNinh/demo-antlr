package com.antlr.demoantlr;

import lombok.Data;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;
@Data
public class CddlListen extends CddlBaseListener {
    private List<CustomModel> models = new ArrayList<>();
    private CustomModel customModel ;
    @Override
    public void enterCddl(CddlParser.CddlContext ctx) {
        customModel = new CustomModel();
    }

    @Override
    public void exitCddl(CddlParser.CddlContext ctx) {
        models.add(customModel);
    }

    @Override
    public void enterTypename(CddlParser.TypenameContext ctx) {
        customModel.setTypename(ctx.getText());
    }

    @Override
    public void enterGroupname(CddlParser.GroupnameContext ctx) {
        customModel.setGroupname(ctx.getText());
    }

    @Override
    public void enterAssignt(CddlParser.AssigntContext ctx) {

        customModel.setAssignt(ctx.getText());
    }

    @Override
    public void enterAssigng(CddlParser.AssigngContext ctx) {
        customModel.setAssignt(ctx.getText());
    }

    @Override
    public void enterGenericparm(CddlParser.GenericparmContext ctx) {
        customModel.setGenericparm(ctx.getText());
    }

    @Override
    public void enterGenericarg(CddlParser.GenericargContext ctx) {
        customModel.setGenericarg(ctx.getText());
    }

    @Override
    public void enterType(CddlParser.TypeContext ctx) {
        customModel.setType(ctx.getText());
    }

    @Override
    public void enterType1(CddlParser.Type1Context ctx) {
        customModel.setType1(ctx.getText());
    }

    @Override
    public void enterType2(CddlParser.Type2Context ctx) {
        customModel.setType2(ctx.getText());
    }

    @Override
    public void enterRangeop(CddlParser.RangeopContext ctx) {
        customModel.setRangeop(ctx.getText());
    }

    @Override
    public void enterCtlop(CddlParser.CtlopContext ctx) {
        customModel.setCtlop(ctx.getText());
    }

    @Override
    public void enterGroup(CddlParser.GroupContext ctx) {
        customModel.setGroup(ctx.getText());
    }

    @Override
    public void enterGrpchoice(CddlParser.GrpchoiceContext ctx) {
        customModel.setGrpchoice(ctx.getText());
    }

    @Override
    public void enterGrpent(CddlParser.GrpentContext ctx) {
        customModel.setGrpent(ctx.getText());
    }

    @Override
    public void enterMemberkey(CddlParser.MemberkeyContext ctx) {
        customModel.setMemberkey(ctx.getText());
    }

    @Override
    public void enterBareword(CddlParser.BarewordContext ctx) {
        customModel.setBareword(ctx.getText());
    }

    @Override
    public void enterOptcom(CddlParser.OptcomContext ctx) {
        customModel.setOptcom(ctx.getText());
    }

    @Override
    public void enterOccur(CddlParser.OccurContext ctx) {
        customModel.setOccur(ctx.getText());
    }

    @Override
    public void enterUint_1(CddlParser.Uint_1Context ctx) {
        customModel.setUint_1(ctx.getText());
    }

    @Override
    public void enterValue(CddlParser.ValueContext ctx) {
        customModel.setValue(ctx.getText());
    }

    @Override
    public void enterInt_1(CddlParser.Int_1Context ctx) {
        customModel.setInt_1(ctx.getText());
    }

    @Override
    public void enterNumber(CddlParser.NumberContext ctx) {
        customModel.setNumber(ctx.getText());
    }

    @Override
    public void enterHexfloat(CddlParser.HexfloatContext ctx) {
        customModel.setHexfloat(ctx.getText());
    }

    @Override
    public void enterFraction(CddlParser.FractionContext ctx) {
        customModel.setFraction(ctx.getText());
    }

    @Override
    public void enterExponent(CddlParser.ExponentContext ctx) {
        customModel.setExponent(ctx.getText());
    }

    @Override
    public void enterText(CddlParser.TextContext ctx) {
        customModel.setText(ctx.getText());
    }

    @Override
    public void enterSchar(CddlParser.ScharContext ctx) {
        customModel.setSchar(ctx.getText());
    }

    @Override
    public void exitSchar(CddlParser.ScharContext ctx) {
        customModel.setSchar(ctx.getText());
    }

    @Override
    public void enterSesc(CddlParser.SescContext ctx) {
        customModel.setSesc(ctx.getText());
    }

    @Override
    public void exitSesc(CddlParser.SescContext ctx) {
        customModel.setSesc(ctx.getText());
    }

    @Override
    public void enterBytes(CddlParser.BytesContext ctx) {
        customModel.setBytes(ctx.getText());
    }

    @Override
    public void enterBchar(CddlParser.BcharContext ctx) {
        customModel.setBchar(ctx.getText());
    }

    @Override
    public void enterBsqual(CddlParser.BsqualContext ctx) {
        customModel.setBsqual(ctx.getText());
    }

    @Override
    public void enterId(CddlParser.IdContext ctx) {
        customModel.setId(ctx.getText());
    }

    @Override
    public void enterAlpha(CddlParser.AlphaContext ctx) {
        customModel.setAlpha(ctx.getText());
    }

    @Override
    public void enterEalpha(CddlParser.EalphaContext ctx) {
        customModel.setEalpha(ctx.getText());
    }

    @Override
    public void enterDigit(CddlParser.DigitContext ctx) {
        customModel.setDigit(ctx.getText());
    }

    @Override
    public void enterDigit1(CddlParser.Digit1Context ctx) {
        customModel.setDigit1(ctx.getText());
    }

    @Override
    public void enterHexdig(CddlParser.HexdigContext ctx) {
        customModel.setHexdig(ctx.getText());
    }

    @Override
    public void enterBindig(CddlParser.BindigContext ctx) {
        customModel.setBindig(ctx.getText());
    }

    @Override
    public void enterS(CddlParser.SContext ctx) {
        super.enterS(ctx);
    }

    @Override
    public void enterWs(CddlParser.WsContext ctx) {
        super.enterWs(ctx);
    }

    @Override
    public void enterSp(CddlParser.SpContext ctx) {
        super.enterSp(ctx);
    }

    @Override
    public void enterNl(CddlParser.NlContext ctx) {
        super.enterNl(ctx);
    }

    @Override
    public void enterComment(CddlParser.CommentContext ctx) {
        super.enterComment(ctx);
    }

    @Override
    public void enterPchar(CddlParser.PcharContext ctx) {
        super.enterPchar(ctx);
    }

    @Override
    public void enterCrlf(CddlParser.CrlfContext ctx) {
        super.enterCrlf(ctx);
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        super.enterEveryRule(ctx);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        super.visitTerminal(node);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        super.visitErrorNode(node);
    }
}
