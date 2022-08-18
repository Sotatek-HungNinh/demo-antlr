package com.antlr.demoantlr;

import lombok.Data;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;
@Data
public class CddlListen extends CddlBaseListener {
    private List<GroupModel> models = new ArrayList<>();
    private GroupModel groupModel;

    private MemberModel memberModel;

    @Override
    public void enterEntry(CddlParser.EntryContext ctx) {

    }

    @Override
    public void exitEntry(CddlParser.EntryContext ctx) {

    }

    @Override
    public void exitRule_1(CddlParser.Rule_1Context ctx) {
        models.add(groupModel);
    }

    @Override
    public void enterRule_1(CddlParser.Rule_1Context ctx) {
        groupModel = new GroupModel();
    }


    @Override
    public void enterCddl(CddlParser.CddlContext ctx) {
//        customModel.setCddl(ctx.getText());
    }

    @Override
    public void enterTypename(CddlParser.TypenameContext ctx) {
        groupModel.setTypename(ctx.getText());
    }

    @Override
    public void enterGroupname(CddlParser.GroupnameContext ctx) {
        groupModel.setGroupname(ctx.getText());
    }

    @Override
    public void enterAssignt(CddlParser.AssigntContext ctx) {

        groupModel.setAssignt(ctx.getText());
    }

    @Override
    public void enterAssigng(CddlParser.AssigngContext ctx) {
        groupModel.setAssignt(ctx.getText());
    }

    @Override
    public void enterGenericparm(CddlParser.GenericparmContext ctx) {
        groupModel.setGenericparm(ctx.getText());
    }

    @Override
    public void enterGenericarg(CddlParser.GenericargContext ctx) {
        groupModel.setGenericarg(ctx.getText());
    }

    @Override
    public void enterType(CddlParser.TypeContext ctx) {
        memberModel.setType(ctx.getText());

    }

    @Override
    public void enterType1(CddlParser.Type1Context ctx) {
        memberModel.setType(ctx.getText());
    }

    @Override
    public void enterType2(CddlParser.Type2Context ctx) {
        memberModel.setType(ctx.getText());
    }

    @Override
    public void enterRangeop(CddlParser.RangeopContext ctx) {
        groupModel.setRangeop(ctx.getText());
    }

    @Override
    public void enterCtlop(CddlParser.CtlopContext ctx) {
        groupModel.setCtlop(ctx.getText());
    }

    @Override
    public void enterGroup(CddlParser.GroupContext ctx) {
        groupModel.setGroup(ctx.getText());
    }

    @Override
    public void enterGrpchoice(CddlParser.GrpchoiceContext ctx) {
        groupModel.setGrpchoice(ctx.getText());
    }

    @Override
    public void enterGrpent(CddlParser.GrpentContext ctx) {
        groupModel.setGrpent(ctx.getText());
    }

    @Override
    public void enterMemberkey(CddlParser.MemberkeyContext ctx) {
        memberModel = new MemberModel();
        memberModel.setMemberKey(ctx.getText());
    }

    @Override
    public void exitMemberkey(CddlParser.MemberkeyContext ctx) {
        groupModel.getMemberModels().add(memberModel);
    }

    @Override
    public void enterBareword(CddlParser.BarewordContext ctx) {
        groupModel.setBareword(ctx.getText());
    }

    @Override
    public void enterOptcom(CddlParser.OptcomContext ctx) {
        groupModel.setOptcom(ctx.getText());
    }

    @Override
    public void enterOccur(CddlParser.OccurContext ctx) {
        groupModel.setOccur(ctx.getText());
    }

    @Override
    public void enterUint_1(CddlParser.Uint_1Context ctx) {
        groupModel.setUint_1(ctx.getText());
    }

    @Override
    public void enterValue(CddlParser.ValueContext ctx) {
        groupModel.setValue(ctx.getText());
    }

    @Override
    public void enterInt_1(CddlParser.Int_1Context ctx) {
        groupModel.setInt_1(ctx.getText());
    }

    @Override
    public void enterNumber(CddlParser.NumberContext ctx) {
        groupModel.setNumber(ctx.getText());
    }

    @Override
    public void enterHexfloat(CddlParser.HexfloatContext ctx) {
        groupModel.setHexfloat(ctx.getText());
    }

    @Override
    public void enterFraction(CddlParser.FractionContext ctx) {
        groupModel.setFraction(ctx.getText());
    }

    @Override
    public void enterExponent(CddlParser.ExponentContext ctx) {
        groupModel.setExponent(ctx.getText());
    }

    @Override
    public void enterText(CddlParser.TextContext ctx) {
        groupModel.setText(ctx.getText());
    }

    @Override
    public void enterSchar(CddlParser.ScharContext ctx) {
        groupModel.setSchar(ctx.getText());
    }

    @Override
    public void exitSchar(CddlParser.ScharContext ctx) {
        groupModel.setSchar(ctx.getText());
    }

    @Override
    public void enterSesc(CddlParser.SescContext ctx) {
        groupModel.setSesc(ctx.getText());
    }

    @Override
    public void exitSesc(CddlParser.SescContext ctx) {
        groupModel.setSesc(ctx.getText());
    }

    @Override
    public void enterBytes(CddlParser.BytesContext ctx) {
        groupModel.setBytes(ctx.getText());
    }

    @Override
    public void enterBchar(CddlParser.BcharContext ctx) {
        groupModel.setBchar(ctx.getText());
    }

    @Override
    public void enterBsqual(CddlParser.BsqualContext ctx) {
        groupModel.setBsqual(ctx.getText());
    }

    @Override
    public void enterId(CddlParser.IdContext ctx) {
        groupModel.setId(ctx.getText());
    }

    @Override
    public void enterAlpha(CddlParser.AlphaContext ctx) {
        groupModel.setAlpha(ctx.getText());
    }

    @Override
    public void enterEalpha(CddlParser.EalphaContext ctx) {
        groupModel.setEalpha(ctx.getText());
    }

    @Override
    public void enterDigit(CddlParser.DigitContext ctx) {
        groupModel.setDigit(ctx.getText());
    }

    @Override
    public void enterDigit1(CddlParser.Digit1Context ctx) {
        groupModel.setDigit1(ctx.getText());
    }

    @Override
    public void enterHexdig(CddlParser.HexdigContext ctx) {
        groupModel.setHexdig(ctx.getText());
    }

    @Override
    public void enterBindig(CddlParser.BindigContext ctx) {
        groupModel.setBindig(ctx.getText());
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
