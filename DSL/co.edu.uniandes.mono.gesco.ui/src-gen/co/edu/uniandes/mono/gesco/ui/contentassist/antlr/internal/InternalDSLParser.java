package co.edu.uniandes.mono.gesco.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import co.edu.uniandes.mono.gesco.services.DSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'x64'", "'x32'", "'Configuracion'", "'{'", "'}'", "','", "'version'", "'descripcion'", "'arquitectura'", "'requerimientos'", "'fuentes'", "'Fuente'", "'='", "'autor:'", "'fuente:'", "'tipoFuente:'", "';'", "'Software'", "'arquitectura:'", "'version:'", "'descripcion:'", "'rutaDestino:'", "'dependencia:'", "'('", "')'", "'origen:'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDSLParser.tokenNames; }
    public String getGrammarFileName() { return "../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g"; }


     
     	private DSLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(DSLGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleConfiguracion"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:60:1: entryRuleConfiguracion : ruleConfiguracion EOF ;
    public final void entryRuleConfiguracion() throws RecognitionException {
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:61:1: ( ruleConfiguracion EOF )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:62:1: ruleConfiguracion EOF
            {
             before(grammarAccess.getConfiguracionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConfiguracion_in_entryRuleConfiguracion61);
            ruleConfiguracion();

            state._fsp--;

             after(grammarAccess.getConfiguracionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConfiguracion68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConfiguracion"


    // $ANTLR start "ruleConfiguracion"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:69:1: ruleConfiguracion : ( ( rule__Configuracion__Group__0 ) ) ;
    public final void ruleConfiguracion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:73:2: ( ( ( rule__Configuracion__Group__0 ) ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:74:1: ( ( rule__Configuracion__Group__0 ) )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:74:1: ( ( rule__Configuracion__Group__0 ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:75:1: ( rule__Configuracion__Group__0 )
            {
             before(grammarAccess.getConfiguracionAccess().getGroup()); 
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:76:1: ( rule__Configuracion__Group__0 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:76:2: rule__Configuracion__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configuracion__Group__0_in_ruleConfiguracion94);
            rule__Configuracion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConfiguracionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfiguracion"


    // $ANTLR start "entryRuleSistemaOperativo"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:88:1: entryRuleSistemaOperativo : ruleSistemaOperativo EOF ;
    public final void entryRuleSistemaOperativo() throws RecognitionException {
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:89:1: ( ruleSistemaOperativo EOF )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:90:1: ruleSistemaOperativo EOF
            {
             before(grammarAccess.getSistemaOperativoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSistemaOperativo_in_entryRuleSistemaOperativo121);
            ruleSistemaOperativo();

            state._fsp--;

             after(grammarAccess.getSistemaOperativoRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSistemaOperativo128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSistemaOperativo"


    // $ANTLR start "ruleSistemaOperativo"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:97:1: ruleSistemaOperativo : ( ( rule__SistemaOperativo__Group__0 ) ) ;
    public final void ruleSistemaOperativo() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:101:2: ( ( ( rule__SistemaOperativo__Group__0 ) ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:102:1: ( ( rule__SistemaOperativo__Group__0 ) )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:102:1: ( ( rule__SistemaOperativo__Group__0 ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:103:1: ( rule__SistemaOperativo__Group__0 )
            {
             before(grammarAccess.getSistemaOperativoAccess().getGroup()); 
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:104:1: ( rule__SistemaOperativo__Group__0 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:104:2: rule__SistemaOperativo__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SistemaOperativo__Group__0_in_ruleSistemaOperativo154);
            rule__SistemaOperativo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSistemaOperativoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSistemaOperativo"


    // $ANTLR start "entryRuleEString"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:116:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:117:1: ( ruleEString EOF )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:118:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString181);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:125:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:129:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:130:1: ( ( rule__EString__Alternatives ) )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:130:1: ( ( rule__EString__Alternatives ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:131:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:132:1: ( rule__EString__Alternatives )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:132:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString214);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleFuentes"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:144:1: entryRuleFuentes : ruleFuentes EOF ;
    public final void entryRuleFuentes() throws RecognitionException {
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:145:1: ( ruleFuentes EOF )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:146:1: ruleFuentes EOF
            {
             before(grammarAccess.getFuentesRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFuentes_in_entryRuleFuentes241);
            ruleFuentes();

            state._fsp--;

             after(grammarAccess.getFuentesRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFuentes248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFuentes"


    // $ANTLR start "ruleFuentes"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:153:1: ruleFuentes : ( ( rule__Fuentes__Group__0 ) ) ;
    public final void ruleFuentes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:157:2: ( ( ( rule__Fuentes__Group__0 ) ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:158:1: ( ( rule__Fuentes__Group__0 ) )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:158:1: ( ( rule__Fuentes__Group__0 ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:159:1: ( rule__Fuentes__Group__0 )
            {
             before(grammarAccess.getFuentesAccess().getGroup()); 
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:160:1: ( rule__Fuentes__Group__0 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:160:2: rule__Fuentes__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fuentes__Group__0_in_ruleFuentes274);
            rule__Fuentes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFuentesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFuentes"


    // $ANTLR start "entryRuleSoftware"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:172:1: entryRuleSoftware : ruleSoftware EOF ;
    public final void entryRuleSoftware() throws RecognitionException {
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:173:1: ( ruleSoftware EOF )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:174:1: ruleSoftware EOF
            {
             before(grammarAccess.getSoftwareRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSoftware_in_entryRuleSoftware301);
            ruleSoftware();

            state._fsp--;

             after(grammarAccess.getSoftwareRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSoftware308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSoftware"


    // $ANTLR start "ruleSoftware"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:181:1: ruleSoftware : ( ( rule__Software__Group__0 ) ) ;
    public final void ruleSoftware() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:185:2: ( ( ( rule__Software__Group__0 ) ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:186:1: ( ( rule__Software__Group__0 ) )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:186:1: ( ( rule__Software__Group__0 ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:187:1: ( rule__Software__Group__0 )
            {
             before(grammarAccess.getSoftwareAccess().getGroup()); 
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:188:1: ( rule__Software__Group__0 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:188:2: rule__Software__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Software__Group__0_in_ruleSoftware334);
            rule__Software__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSoftwareAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSoftware"


    // $ANTLR start "ruleArquitectura"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:201:1: ruleArquitectura : ( ( rule__Arquitectura__Alternatives ) ) ;
    public final void ruleArquitectura() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:205:1: ( ( ( rule__Arquitectura__Alternatives ) ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:206:1: ( ( rule__Arquitectura__Alternatives ) )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:206:1: ( ( rule__Arquitectura__Alternatives ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:207:1: ( rule__Arquitectura__Alternatives )
            {
             before(grammarAccess.getArquitecturaAccess().getAlternatives()); 
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:208:1: ( rule__Arquitectura__Alternatives )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:208:2: rule__Arquitectura__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Arquitectura__Alternatives_in_ruleArquitectura371);
            rule__Arquitectura__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getArquitecturaAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArquitectura"


    // $ANTLR start "rule__EString__Alternatives"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:219:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:223:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:224:1: ( RULE_STRING )
                    {
                    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:224:1: ( RULE_STRING )
                    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:225:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives406); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:230:6: ( RULE_ID )
                    {
                    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:230:6: ( RULE_ID )
                    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:231:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives423); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Arquitectura__Alternatives"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:241:1: rule__Arquitectura__Alternatives : ( ( ( 'x64' ) ) | ( ( 'x32' ) ) );
    public final void rule__Arquitectura__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:245:1: ( ( ( 'x64' ) ) | ( ( 'x32' ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:246:1: ( ( 'x64' ) )
                    {
                    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:246:1: ( ( 'x64' ) )
                    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:247:1: ( 'x64' )
                    {
                     before(grammarAccess.getArquitecturaAccess().getX64EnumLiteralDeclaration_0()); 
                    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:248:1: ( 'x64' )
                    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:248:3: 'x64'
                    {
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__Arquitectura__Alternatives456); 

                    }

                     after(grammarAccess.getArquitecturaAccess().getX64EnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:253:6: ( ( 'x32' ) )
                    {
                    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:253:6: ( ( 'x32' ) )
                    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:254:1: ( 'x32' )
                    {
                     before(grammarAccess.getArquitecturaAccess().getX32EnumLiteralDeclaration_1()); 
                    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:255:1: ( 'x32' )
                    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:255:3: 'x32'
                    {
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__Arquitectura__Alternatives477); 

                    }

                     after(grammarAccess.getArquitecturaAccess().getX32EnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arquitectura__Alternatives"


    // $ANTLR start "rule__Configuracion__Group__0"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:267:1: rule__Configuracion__Group__0 : rule__Configuracion__Group__0__Impl rule__Configuracion__Group__1 ;
    public final void rule__Configuracion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:271:1: ( rule__Configuracion__Group__0__Impl rule__Configuracion__Group__1 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:272:2: rule__Configuracion__Group__0__Impl rule__Configuracion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configuracion__Group__0__Impl_in_rule__Configuracion__Group__0510);
            rule__Configuracion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Configuracion__Group__1_in_rule__Configuracion__Group__0513);
            rule__Configuracion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuracion__Group__0"


    // $ANTLR start "rule__Configuracion__Group__0__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:279:1: rule__Configuracion__Group__0__Impl : ( () ) ;
    public final void rule__Configuracion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:283:1: ( ( () ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:284:1: ( () )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:284:1: ( () )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:285:1: ()
            {
             before(grammarAccess.getConfiguracionAccess().getConfiguracionAction_0()); 
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:286:1: ()
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:288:1: 
            {
            }

             after(grammarAccess.getConfiguracionAccess().getConfiguracionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuracion__Group__0__Impl"


    // $ANTLR start "rule__Configuracion__Group__1"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:298:1: rule__Configuracion__Group__1 : rule__Configuracion__Group__1__Impl rule__Configuracion__Group__2 ;
    public final void rule__Configuracion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:302:1: ( rule__Configuracion__Group__1__Impl rule__Configuracion__Group__2 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:303:2: rule__Configuracion__Group__1__Impl rule__Configuracion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configuracion__Group__1__Impl_in_rule__Configuracion__Group__1571);
            rule__Configuracion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Configuracion__Group__2_in_rule__Configuracion__Group__1574);
            rule__Configuracion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuracion__Group__1"


    // $ANTLR start "rule__Configuracion__Group__1__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:310:1: rule__Configuracion__Group__1__Impl : ( 'Configuracion' ) ;
    public final void rule__Configuracion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:314:1: ( ( 'Configuracion' ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:315:1: ( 'Configuracion' )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:315:1: ( 'Configuracion' )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:316:1: 'Configuracion'
            {
             before(grammarAccess.getConfiguracionAccess().getConfiguracionKeyword_1()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Configuracion__Group__1__Impl602); 
             after(grammarAccess.getConfiguracionAccess().getConfiguracionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuracion__Group__1__Impl"


    // $ANTLR start "rule__Configuracion__Group__2"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:329:1: rule__Configuracion__Group__2 : rule__Configuracion__Group__2__Impl rule__Configuracion__Group__3 ;
    public final void rule__Configuracion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:333:1: ( rule__Configuracion__Group__2__Impl rule__Configuracion__Group__3 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:334:2: rule__Configuracion__Group__2__Impl rule__Configuracion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configuracion__Group__2__Impl_in_rule__Configuracion__Group__2633);
            rule__Configuracion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Configuracion__Group__3_in_rule__Configuracion__Group__2636);
            rule__Configuracion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuracion__Group__2"


    // $ANTLR start "rule__Configuracion__Group__2__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:341:1: rule__Configuracion__Group__2__Impl : ( '{' ) ;
    public final void rule__Configuracion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:345:1: ( ( '{' ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:346:1: ( '{' )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:346:1: ( '{' )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:347:1: '{'
            {
             before(grammarAccess.getConfiguracionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Configuracion__Group__2__Impl664); 
             after(grammarAccess.getConfiguracionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuracion__Group__2__Impl"


    // $ANTLR start "rule__Configuracion__Group__3"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:360:1: rule__Configuracion__Group__3 : rule__Configuracion__Group__3__Impl rule__Configuracion__Group__4 ;
    public final void rule__Configuracion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:364:1: ( rule__Configuracion__Group__3__Impl rule__Configuracion__Group__4 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:365:2: rule__Configuracion__Group__3__Impl rule__Configuracion__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configuracion__Group__3__Impl_in_rule__Configuracion__Group__3695);
            rule__Configuracion__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Configuracion__Group__4_in_rule__Configuracion__Group__3698);
            rule__Configuracion__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuracion__Group__3"


    // $ANTLR start "rule__Configuracion__Group__3__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:372:1: rule__Configuracion__Group__3__Impl : ( ( rule__Configuracion__Group_3__0 )? ) ;
    public final void rule__Configuracion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:376:1: ( ( ( rule__Configuracion__Group_3__0 )? ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:377:1: ( ( rule__Configuracion__Group_3__0 )? )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:377:1: ( ( rule__Configuracion__Group_3__0 )? )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:378:1: ( rule__Configuracion__Group_3__0 )?
            {
             before(grammarAccess.getConfiguracionAccess().getGroup_3()); 
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:379:1: ( rule__Configuracion__Group_3__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_STRING && LA3_0<=RULE_ID)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:379:2: rule__Configuracion__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Configuracion__Group_3__0_in_rule__Configuracion__Group__3__Impl725);
                    rule__Configuracion__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConfiguracionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuracion__Group__3__Impl"


    // $ANTLR start "rule__Configuracion__Group__4"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:389:1: rule__Configuracion__Group__4 : rule__Configuracion__Group__4__Impl ;
    public final void rule__Configuracion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:393:1: ( rule__Configuracion__Group__4__Impl )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:394:2: rule__Configuracion__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configuracion__Group__4__Impl_in_rule__Configuracion__Group__4756);
            rule__Configuracion__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuracion__Group__4"


    // $ANTLR start "rule__Configuracion__Group__4__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:400:1: rule__Configuracion__Group__4__Impl : ( '}' ) ;
    public final void rule__Configuracion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:404:1: ( ( '}' ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:405:1: ( '}' )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:405:1: ( '}' )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:406:1: '}'
            {
             before(grammarAccess.getConfiguracionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Configuracion__Group__4__Impl784); 
             after(grammarAccess.getConfiguracionAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuracion__Group__4__Impl"


    // $ANTLR start "rule__Configuracion__Group_3__0"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:429:1: rule__Configuracion__Group_3__0 : rule__Configuracion__Group_3__0__Impl rule__Configuracion__Group_3__1 ;
    public final void rule__Configuracion__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:433:1: ( rule__Configuracion__Group_3__0__Impl rule__Configuracion__Group_3__1 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:434:2: rule__Configuracion__Group_3__0__Impl rule__Configuracion__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configuracion__Group_3__0__Impl_in_rule__Configuracion__Group_3__0825);
            rule__Configuracion__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Configuracion__Group_3__1_in_rule__Configuracion__Group_3__0828);
            rule__Configuracion__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuracion__Group_3__0"


    // $ANTLR start "rule__Configuracion__Group_3__0__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:441:1: rule__Configuracion__Group_3__0__Impl : ( ( rule__Configuracion__SistemaOperativoAssignment_3_0 ) ) ;
    public final void rule__Configuracion__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:445:1: ( ( ( rule__Configuracion__SistemaOperativoAssignment_3_0 ) ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:446:1: ( ( rule__Configuracion__SistemaOperativoAssignment_3_0 ) )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:446:1: ( ( rule__Configuracion__SistemaOperativoAssignment_3_0 ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:447:1: ( rule__Configuracion__SistemaOperativoAssignment_3_0 )
            {
             before(grammarAccess.getConfiguracionAccess().getSistemaOperativoAssignment_3_0()); 
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:448:1: ( rule__Configuracion__SistemaOperativoAssignment_3_0 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:448:2: rule__Configuracion__SistemaOperativoAssignment_3_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configuracion__SistemaOperativoAssignment_3_0_in_rule__Configuracion__Group_3__0__Impl855);
            rule__Configuracion__SistemaOperativoAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getConfiguracionAccess().getSistemaOperativoAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuracion__Group_3__0__Impl"


    // $ANTLR start "rule__Configuracion__Group_3__1"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:458:1: rule__Configuracion__Group_3__1 : rule__Configuracion__Group_3__1__Impl ;
    public final void rule__Configuracion__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:462:1: ( rule__Configuracion__Group_3__1__Impl )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:463:2: rule__Configuracion__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configuracion__Group_3__1__Impl_in_rule__Configuracion__Group_3__1885);
            rule__Configuracion__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuracion__Group_3__1"


    // $ANTLR start "rule__Configuracion__Group_3__1__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:469:1: rule__Configuracion__Group_3__1__Impl : ( ( rule__Configuracion__Group_3_1__0 )* ) ;
    public final void rule__Configuracion__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:473:1: ( ( ( rule__Configuracion__Group_3_1__0 )* ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:474:1: ( ( rule__Configuracion__Group_3_1__0 )* )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:474:1: ( ( rule__Configuracion__Group_3_1__0 )* )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:475:1: ( rule__Configuracion__Group_3_1__0 )*
            {
             before(grammarAccess.getConfiguracionAccess().getGroup_3_1()); 
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:476:1: ( rule__Configuracion__Group_3_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:476:2: rule__Configuracion__Group_3_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Configuracion__Group_3_1__0_in_rule__Configuracion__Group_3__1__Impl912);
            	    rule__Configuracion__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getConfiguracionAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuracion__Group_3__1__Impl"


    // $ANTLR start "rule__Configuracion__Group_3_1__0"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:490:1: rule__Configuracion__Group_3_1__0 : rule__Configuracion__Group_3_1__0__Impl rule__Configuracion__Group_3_1__1 ;
    public final void rule__Configuracion__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:494:1: ( rule__Configuracion__Group_3_1__0__Impl rule__Configuracion__Group_3_1__1 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:495:2: rule__Configuracion__Group_3_1__0__Impl rule__Configuracion__Group_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configuracion__Group_3_1__0__Impl_in_rule__Configuracion__Group_3_1__0947);
            rule__Configuracion__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Configuracion__Group_3_1__1_in_rule__Configuracion__Group_3_1__0950);
            rule__Configuracion__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuracion__Group_3_1__0"


    // $ANTLR start "rule__Configuracion__Group_3_1__0__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:502:1: rule__Configuracion__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Configuracion__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:506:1: ( ( ',' ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:507:1: ( ',' )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:507:1: ( ',' )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:508:1: ','
            {
             before(grammarAccess.getConfiguracionAccess().getCommaKeyword_3_1_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Configuracion__Group_3_1__0__Impl978); 
             after(grammarAccess.getConfiguracionAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuracion__Group_3_1__0__Impl"


    // $ANTLR start "rule__Configuracion__Group_3_1__1"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:521:1: rule__Configuracion__Group_3_1__1 : rule__Configuracion__Group_3_1__1__Impl ;
    public final void rule__Configuracion__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:525:1: ( rule__Configuracion__Group_3_1__1__Impl )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:526:2: rule__Configuracion__Group_3_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configuracion__Group_3_1__1__Impl_in_rule__Configuracion__Group_3_1__11009);
            rule__Configuracion__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuracion__Group_3_1__1"


    // $ANTLR start "rule__Configuracion__Group_3_1__1__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:532:1: rule__Configuracion__Group_3_1__1__Impl : ( ( rule__Configuracion__SistemaOperativoAssignment_3_1_1 ) ) ;
    public final void rule__Configuracion__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:536:1: ( ( ( rule__Configuracion__SistemaOperativoAssignment_3_1_1 ) ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:537:1: ( ( rule__Configuracion__SistemaOperativoAssignment_3_1_1 ) )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:537:1: ( ( rule__Configuracion__SistemaOperativoAssignment_3_1_1 ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:538:1: ( rule__Configuracion__SistemaOperativoAssignment_3_1_1 )
            {
             before(grammarAccess.getConfiguracionAccess().getSistemaOperativoAssignment_3_1_1()); 
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:539:1: ( rule__Configuracion__SistemaOperativoAssignment_3_1_1 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:539:2: rule__Configuracion__SistemaOperativoAssignment_3_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Configuracion__SistemaOperativoAssignment_3_1_1_in_rule__Configuracion__Group_3_1__1__Impl1036);
            rule__Configuracion__SistemaOperativoAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConfiguracionAccess().getSistemaOperativoAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuracion__Group_3_1__1__Impl"


    // $ANTLR start "rule__SistemaOperativo__Group__0"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:553:1: rule__SistemaOperativo__Group__0 : rule__SistemaOperativo__Group__0__Impl rule__SistemaOperativo__Group__1 ;
    public final void rule__SistemaOperativo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:557:1: ( rule__SistemaOperativo__Group__0__Impl rule__SistemaOperativo__Group__1 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:558:2: rule__SistemaOperativo__Group__0__Impl rule__SistemaOperativo__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SistemaOperativo__Group__0__Impl_in_rule__SistemaOperativo__Group__01070);
            rule__SistemaOperativo__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SistemaOperativo__Group__1_in_rule__SistemaOperativo__Group__01073);
            rule__SistemaOperativo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SistemaOperativo__Group__0"


    // $ANTLR start "rule__SistemaOperativo__Group__0__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:565:1: rule__SistemaOperativo__Group__0__Impl : ( () ) ;
    public final void rule__SistemaOperativo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:569:1: ( ( () ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:570:1: ( () )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:570:1: ( () )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:571:1: ()
            {
             before(grammarAccess.getSistemaOperativoAccess().getSistemaOperativoAction_0()); 
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:572:1: ()
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:574:1: 
            {
            }

             after(grammarAccess.getSistemaOperativoAccess().getSistemaOperativoAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SistemaOperativo__Group__0__Impl"


    // $ANTLR start "rule__SistemaOperativo__Group__1"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:584:1: rule__SistemaOperativo__Group__1 : rule__SistemaOperativo__Group__1__Impl rule__SistemaOperativo__Group__2 ;
    public final void rule__SistemaOperativo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:588:1: ( rule__SistemaOperativo__Group__1__Impl rule__SistemaOperativo__Group__2 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:589:2: rule__SistemaOperativo__Group__1__Impl rule__SistemaOperativo__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SistemaOperativo__Group__1__Impl_in_rule__SistemaOperativo__Group__11131);
            rule__SistemaOperativo__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SistemaOperativo__Group__2_in_rule__SistemaOperativo__Group__11134);
            rule__SistemaOperativo__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SistemaOperativo__Group__1"


    // $ANTLR start "rule__SistemaOperativo__Group__1__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:596:1: rule__SistemaOperativo__Group__1__Impl : ( ( rule__SistemaOperativo__NameAssignment_1 ) ) ;
    public final void rule__SistemaOperativo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:600:1: ( ( ( rule__SistemaOperativo__NameAssignment_1 ) ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:601:1: ( ( rule__SistemaOperativo__NameAssignment_1 ) )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:601:1: ( ( rule__SistemaOperativo__NameAssignment_1 ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:602:1: ( rule__SistemaOperativo__NameAssignment_1 )
            {
             before(grammarAccess.getSistemaOperativoAccess().getNameAssignment_1()); 
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:603:1: ( rule__SistemaOperativo__NameAssignment_1 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:603:2: rule__SistemaOperativo__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SistemaOperativo__NameAssignment_1_in_rule__SistemaOperativo__Group__1__Impl1161);
            rule__SistemaOperativo__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSistemaOperativoAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SistemaOperativo__Group__1__Impl"


    // $ANTLR start "rule__SistemaOperativo__Group__2"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:613:1: rule__SistemaOperativo__Group__2 : rule__SistemaOperativo__Group__2__Impl rule__SistemaOperativo__Group__3 ;
    public final void rule__SistemaOperativo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:617:1: ( rule__SistemaOperativo__Group__2__Impl rule__SistemaOperativo__Group__3 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:618:2: rule__SistemaOperativo__Group__2__Impl rule__SistemaOperativo__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SistemaOperativo__Group__2__Impl_in_rule__SistemaOperativo__Group__21191);
            rule__SistemaOperativo__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SistemaOperativo__Group__3_in_rule__SistemaOperativo__Group__21194);
            rule__SistemaOperativo__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SistemaOperativo__Group__2"


    // $ANTLR start "rule__SistemaOperativo__Group__2__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:625:1: rule__SistemaOperativo__Group__2__Impl : ( '{' ) ;
    public final void rule__SistemaOperativo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:629:1: ( ( '{' ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:630:1: ( '{' )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:630:1: ( '{' )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:631:1: '{'
            {
             before(grammarAccess.getSistemaOperativoAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__SistemaOperativo__Group__2__Impl1222); 
             after(grammarAccess.getSistemaOperativoAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SistemaOperativo__Group__2__Impl"


    // $ANTLR start "rule__SistemaOperativo__Group__3"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:644:1: rule__SistemaOperativo__Group__3 : rule__SistemaOperativo__Group__3__Impl rule__SistemaOperativo__Group__4 ;
    public final void rule__SistemaOperativo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:648:1: ( rule__SistemaOperativo__Group__3__Impl rule__SistemaOperativo__Group__4 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:649:2: rule__SistemaOperativo__Group__3__Impl rule__SistemaOperativo__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__SistemaOperativo__Group__3__Impl_in_rule__SistemaOperativo__Group__31253);
            rule__SistemaOperativo__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SistemaOperativo__Group__4_in_rule__SistemaOperativo__Group__31256);
            rule__SistemaOperativo__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SistemaOperativo__Group__3"


    // $ANTLR start "rule__SistemaOperativo__Group__3__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:656:1: rule__SistemaOperativo__Group__3__Impl : ( 'version' ) ;
    public final void rule__SistemaOperativo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:660:1: ( ( 'version' ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:661:1: ( 'version' )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:661:1: ( 'version' )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:662:1: 'version'
            {
             before(grammarAccess.getSistemaOperativoAccess().getVersionKeyword_3()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__SistemaOperativo__Group__3__Impl1284); 
             after(grammarAccess.getSistemaOperativoAccess().getVersionKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SistemaOperativo__Group__3__Impl"


    // $ANTLR start "rule__SistemaOperativo__Group__4"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:675:1: rule__SistemaOperativo__Group__4 : rule__SistemaOperativo__Group__4__Impl rule__SistemaOperativo__Group__5 ;
    public final void rule__SistemaOperativo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:679:1: ( rule__SistemaOperativo__Group__4__Impl rule__SistemaOperativo__Group__5 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:680:2: rule__SistemaOperativo__Group__4__Impl rule__SistemaOperativo__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__SistemaOperativo__Group__4__Impl_in_rule__SistemaOperativo__Group__41315);
            rule__SistemaOperativo__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SistemaOperativo__Group__5_in_rule__SistemaOperativo__Group__41318);
            rule__SistemaOperativo__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SistemaOperativo__Group__4"


    // $ANTLR start "rule__SistemaOperativo__Group__4__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:687:1: rule__SistemaOperativo__Group__4__Impl : ( ( rule__SistemaOperativo__VersionAssignment_4 ) ) ;
    public final void rule__SistemaOperativo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:691:1: ( ( ( rule__SistemaOperativo__VersionAssignment_4 ) ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:692:1: ( ( rule__SistemaOperativo__VersionAssignment_4 ) )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:692:1: ( ( rule__SistemaOperativo__VersionAssignment_4 ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:693:1: ( rule__SistemaOperativo__VersionAssignment_4 )
            {
             before(grammarAccess.getSistemaOperativoAccess().getVersionAssignment_4()); 
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:694:1: ( rule__SistemaOperativo__VersionAssignment_4 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:694:2: rule__SistemaOperativo__VersionAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__SistemaOperativo__VersionAssignment_4_in_rule__SistemaOperativo__Group__4__Impl1345);
            rule__SistemaOperativo__VersionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSistemaOperativoAccess().getVersionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SistemaOperativo__Group__4__Impl"


    // $ANTLR start "rule__SistemaOperativo__Group__5"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:704:1: rule__SistemaOperativo__Group__5 : rule__SistemaOperativo__Group__5__Impl rule__SistemaOperativo__Group__6 ;
    public final void rule__SistemaOperativo__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:708:1: ( rule__SistemaOperativo__Group__5__Impl rule__SistemaOperativo__Group__6 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:709:2: rule__SistemaOperativo__Group__5__Impl rule__SistemaOperativo__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__SistemaOperativo__Group__5__Impl_in_rule__SistemaOperativo__Group__51375);
            rule__SistemaOperativo__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SistemaOperativo__Group__6_in_rule__SistemaOperativo__Group__51378);
            rule__SistemaOperativo__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SistemaOperativo__Group__5"


    // $ANTLR start "rule__SistemaOperativo__Group__5__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:716:1: rule__SistemaOperativo__Group__5__Impl : ( 'descripcion' ) ;
    public final void rule__SistemaOperativo__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:720:1: ( ( 'descripcion' ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:721:1: ( 'descripcion' )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:721:1: ( 'descripcion' )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:722:1: 'descripcion'
            {
             before(grammarAccess.getSistemaOperativoAccess().getDescripcionKeyword_5()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__SistemaOperativo__Group__5__Impl1406); 
             after(grammarAccess.getSistemaOperativoAccess().getDescripcionKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SistemaOperativo__Group__5__Impl"


    // $ANTLR start "rule__SistemaOperativo__Group__6"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:735:1: rule__SistemaOperativo__Group__6 : rule__SistemaOperativo__Group__6__Impl rule__SistemaOperativo__Group__7 ;
    public final void rule__SistemaOperativo__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:739:1: ( rule__SistemaOperativo__Group__6__Impl rule__SistemaOperativo__Group__7 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:740:2: rule__SistemaOperativo__Group__6__Impl rule__SistemaOperativo__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__SistemaOperativo__Group__6__Impl_in_rule__SistemaOperativo__Group__61437);
            rule__SistemaOperativo__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SistemaOperativo__Group__7_in_rule__SistemaOperativo__Group__61440);
            rule__SistemaOperativo__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SistemaOperativo__Group__6"


    // $ANTLR start "rule__SistemaOperativo__Group__6__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:747:1: rule__SistemaOperativo__Group__6__Impl : ( ( rule__SistemaOperativo__DescripcionAssignment_6 ) ) ;
    public final void rule__SistemaOperativo__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:751:1: ( ( ( rule__SistemaOperativo__DescripcionAssignment_6 ) ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:752:1: ( ( rule__SistemaOperativo__DescripcionAssignment_6 ) )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:752:1: ( ( rule__SistemaOperativo__DescripcionAssignment_6 ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:753:1: ( rule__SistemaOperativo__DescripcionAssignment_6 )
            {
             before(grammarAccess.getSistemaOperativoAccess().getDescripcionAssignment_6()); 
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:754:1: ( rule__SistemaOperativo__DescripcionAssignment_6 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:754:2: rule__SistemaOperativo__DescripcionAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__SistemaOperativo__DescripcionAssignment_6_in_rule__SistemaOperativo__Group__6__Impl1467);
            rule__SistemaOperativo__DescripcionAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getSistemaOperativoAccess().getDescripcionAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SistemaOperativo__Group__6__Impl"


    // $ANTLR start "rule__SistemaOperativo__Group__7"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:764:1: rule__SistemaOperativo__Group__7 : rule__SistemaOperativo__Group__7__Impl rule__SistemaOperativo__Group__8 ;
    public final void rule__SistemaOperativo__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:768:1: ( rule__SistemaOperativo__Group__7__Impl rule__SistemaOperativo__Group__8 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:769:2: rule__SistemaOperativo__Group__7__Impl rule__SistemaOperativo__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__SistemaOperativo__Group__7__Impl_in_rule__SistemaOperativo__Group__71497);
            rule__SistemaOperativo__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SistemaOperativo__Group__8_in_rule__SistemaOperativo__Group__71500);
            rule__SistemaOperativo__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SistemaOperativo__Group__7"


    // $ANTLR start "rule__SistemaOperativo__Group__7__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:776:1: rule__SistemaOperativo__Group__7__Impl : ( 'arquitectura' ) ;
    public final void rule__SistemaOperativo__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:780:1: ( ( 'arquitectura' ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:781:1: ( 'arquitectura' )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:781:1: ( 'arquitectura' )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:782:1: 'arquitectura'
            {
             before(grammarAccess.getSistemaOperativoAccess().getArquitecturaKeyword_7()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__SistemaOperativo__Group__7__Impl1528); 
             after(grammarAccess.getSistemaOperativoAccess().getArquitecturaKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SistemaOperativo__Group__7__Impl"


    // $ANTLR start "rule__SistemaOperativo__Group__8"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:795:1: rule__SistemaOperativo__Group__8 : rule__SistemaOperativo__Group__8__Impl rule__SistemaOperativo__Group__9 ;
    public final void rule__SistemaOperativo__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:799:1: ( rule__SistemaOperativo__Group__8__Impl rule__SistemaOperativo__Group__9 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:800:2: rule__SistemaOperativo__Group__8__Impl rule__SistemaOperativo__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__SistemaOperativo__Group__8__Impl_in_rule__SistemaOperativo__Group__81559);
            rule__SistemaOperativo__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SistemaOperativo__Group__9_in_rule__SistemaOperativo__Group__81562);
            rule__SistemaOperativo__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SistemaOperativo__Group__8"


    // $ANTLR start "rule__SistemaOperativo__Group__8__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:807:1: rule__SistemaOperativo__Group__8__Impl : ( ( rule__SistemaOperativo__ArquitecturaAssignment_8 ) ) ;
    public final void rule__SistemaOperativo__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:811:1: ( ( ( rule__SistemaOperativo__ArquitecturaAssignment_8 ) ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:812:1: ( ( rule__SistemaOperativo__ArquitecturaAssignment_8 ) )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:812:1: ( ( rule__SistemaOperativo__ArquitecturaAssignment_8 ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:813:1: ( rule__SistemaOperativo__ArquitecturaAssignment_8 )
            {
             before(grammarAccess.getSistemaOperativoAccess().getArquitecturaAssignment_8()); 
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:814:1: ( rule__SistemaOperativo__ArquitecturaAssignment_8 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:814:2: rule__SistemaOperativo__ArquitecturaAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__SistemaOperativo__ArquitecturaAssignment_8_in_rule__SistemaOperativo__Group__8__Impl1589);
            rule__SistemaOperativo__ArquitecturaAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getSistemaOperativoAccess().getArquitecturaAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SistemaOperativo__Group__8__Impl"


    // $ANTLR start "rule__SistemaOperativo__Group__9"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:824:1: rule__SistemaOperativo__Group__9 : rule__SistemaOperativo__Group__9__Impl rule__SistemaOperativo__Group__10 ;
    public final void rule__SistemaOperativo__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:828:1: ( rule__SistemaOperativo__Group__9__Impl rule__SistemaOperativo__Group__10 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:829:2: rule__SistemaOperativo__Group__9__Impl rule__SistemaOperativo__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__SistemaOperativo__Group__9__Impl_in_rule__SistemaOperativo__Group__91619);
            rule__SistemaOperativo__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SistemaOperativo__Group__10_in_rule__SistemaOperativo__Group__91622);
            rule__SistemaOperativo__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SistemaOperativo__Group__9"


    // $ANTLR start "rule__SistemaOperativo__Group__9__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:836:1: rule__SistemaOperativo__Group__9__Impl : ( ( rule__SistemaOperativo__Group_9__0 )? ) ;
    public final void rule__SistemaOperativo__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:840:1: ( ( ( rule__SistemaOperativo__Group_9__0 )? ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:841:1: ( ( rule__SistemaOperativo__Group_9__0 )? )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:841:1: ( ( rule__SistemaOperativo__Group_9__0 )? )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:842:1: ( rule__SistemaOperativo__Group_9__0 )?
            {
             before(grammarAccess.getSistemaOperativoAccess().getGroup_9()); 
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:843:1: ( rule__SistemaOperativo__Group_9__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:843:2: rule__SistemaOperativo__Group_9__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SistemaOperativo__Group_9__0_in_rule__SistemaOperativo__Group__9__Impl1649);
                    rule__SistemaOperativo__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSistemaOperativoAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SistemaOperativo__Group__9__Impl"


    // $ANTLR start "rule__SistemaOperativo__Group__10"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:853:1: rule__SistemaOperativo__Group__10 : rule__SistemaOperativo__Group__10__Impl rule__SistemaOperativo__Group__11 ;
    public final void rule__SistemaOperativo__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:857:1: ( rule__SistemaOperativo__Group__10__Impl rule__SistemaOperativo__Group__11 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:858:2: rule__SistemaOperativo__Group__10__Impl rule__SistemaOperativo__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__SistemaOperativo__Group__10__Impl_in_rule__SistemaOperativo__Group__101680);
            rule__SistemaOperativo__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SistemaOperativo__Group__11_in_rule__SistemaOperativo__Group__101683);
            rule__SistemaOperativo__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SistemaOperativo__Group__10"


    // $ANTLR start "rule__SistemaOperativo__Group__10__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:865:1: rule__SistemaOperativo__Group__10__Impl : ( 'requerimientos' ) ;
    public final void rule__SistemaOperativo__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:869:1: ( ( 'requerimientos' ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:870:1: ( 'requerimientos' )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:870:1: ( 'requerimientos' )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:871:1: 'requerimientos'
            {
             before(grammarAccess.getSistemaOperativoAccess().getRequerimientosKeyword_10()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__SistemaOperativo__Group__10__Impl1711); 
             after(grammarAccess.getSistemaOperativoAccess().getRequerimientosKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SistemaOperativo__Group__10__Impl"


    // $ANTLR start "rule__SistemaOperativo__Group__11"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:884:1: rule__SistemaOperativo__Group__11 : rule__SistemaOperativo__Group__11__Impl rule__SistemaOperativo__Group__12 ;
    public final void rule__SistemaOperativo__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:888:1: ( rule__SistemaOperativo__Group__11__Impl rule__SistemaOperativo__Group__12 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:889:2: rule__SistemaOperativo__Group__11__Impl rule__SistemaOperativo__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__SistemaOperativo__Group__11__Impl_in_rule__SistemaOperativo__Group__111742);
            rule__SistemaOperativo__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SistemaOperativo__Group__12_in_rule__SistemaOperativo__Group__111745);
            rule__SistemaOperativo__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SistemaOperativo__Group__11"


    // $ANTLR start "rule__SistemaOperativo__Group__11__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:896:1: rule__SistemaOperativo__Group__11__Impl : ( '{' ) ;
    public final void rule__SistemaOperativo__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:900:1: ( ( '{' ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:901:1: ( '{' )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:901:1: ( '{' )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:902:1: '{'
            {
             before(grammarAccess.getSistemaOperativoAccess().getLeftCurlyBracketKeyword_11()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__SistemaOperativo__Group__11__Impl1773); 
             after(grammarAccess.getSistemaOperativoAccess().getLeftCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SistemaOperativo__Group__11__Impl"


    // $ANTLR start "rule__SistemaOperativo__Group__12"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:915:1: rule__SistemaOperativo__Group__12 : rule__SistemaOperativo__Group__12__Impl rule__SistemaOperativo__Group__13 ;
    public final void rule__SistemaOperativo__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:919:1: ( rule__SistemaOperativo__Group__12__Impl rule__SistemaOperativo__Group__13 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:920:2: rule__SistemaOperativo__Group__12__Impl rule__SistemaOperativo__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_rule__SistemaOperativo__Group__12__Impl_in_rule__SistemaOperativo__Group__121804);
            rule__SistemaOperativo__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SistemaOperativo__Group__13_in_rule__SistemaOperativo__Group__121807);
            rule__SistemaOperativo__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SistemaOperativo__Group__12"


    // $ANTLR start "rule__SistemaOperativo__Group__12__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:927:1: rule__SistemaOperativo__Group__12__Impl : ( ( rule__SistemaOperativo__RequerimientosAssignment_12 ) ) ;
    public final void rule__SistemaOperativo__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:931:1: ( ( ( rule__SistemaOperativo__RequerimientosAssignment_12 ) ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:932:1: ( ( rule__SistemaOperativo__RequerimientosAssignment_12 ) )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:932:1: ( ( rule__SistemaOperativo__RequerimientosAssignment_12 ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:933:1: ( rule__SistemaOperativo__RequerimientosAssignment_12 )
            {
             before(grammarAccess.getSistemaOperativoAccess().getRequerimientosAssignment_12()); 
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:934:1: ( rule__SistemaOperativo__RequerimientosAssignment_12 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:934:2: rule__SistemaOperativo__RequerimientosAssignment_12
            {
            pushFollow(FollowSets000.FOLLOW_rule__SistemaOperativo__RequerimientosAssignment_12_in_rule__SistemaOperativo__Group__12__Impl1834);
            rule__SistemaOperativo__RequerimientosAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getSistemaOperativoAccess().getRequerimientosAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SistemaOperativo__Group__12__Impl"


    // $ANTLR start "rule__SistemaOperativo__Group__13"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:944:1: rule__SistemaOperativo__Group__13 : rule__SistemaOperativo__Group__13__Impl rule__SistemaOperativo__Group__14 ;
    public final void rule__SistemaOperativo__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:948:1: ( rule__SistemaOperativo__Group__13__Impl rule__SistemaOperativo__Group__14 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:949:2: rule__SistemaOperativo__Group__13__Impl rule__SistemaOperativo__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_rule__SistemaOperativo__Group__13__Impl_in_rule__SistemaOperativo__Group__131864);
            rule__SistemaOperativo__Group__13__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SistemaOperativo__Group__14_in_rule__SistemaOperativo__Group__131867);
            rule__SistemaOperativo__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SistemaOperativo__Group__13"


    // $ANTLR start "rule__SistemaOperativo__Group__13__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:956:1: rule__SistemaOperativo__Group__13__Impl : ( ( rule__SistemaOperativo__RequerimientosAssignment_13 )* ) ;
    public final void rule__SistemaOperativo__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:960:1: ( ( ( rule__SistemaOperativo__RequerimientosAssignment_13 )* ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:961:1: ( ( rule__SistemaOperativo__RequerimientosAssignment_13 )* )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:961:1: ( ( rule__SistemaOperativo__RequerimientosAssignment_13 )* )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:962:1: ( rule__SistemaOperativo__RequerimientosAssignment_13 )*
            {
             before(grammarAccess.getSistemaOperativoAccess().getRequerimientosAssignment_13()); 
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:963:1: ( rule__SistemaOperativo__RequerimientosAssignment_13 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==28) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:963:2: rule__SistemaOperativo__RequerimientosAssignment_13
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__SistemaOperativo__RequerimientosAssignment_13_in_rule__SistemaOperativo__Group__13__Impl1894);
            	    rule__SistemaOperativo__RequerimientosAssignment_13();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getSistemaOperativoAccess().getRequerimientosAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SistemaOperativo__Group__13__Impl"


    // $ANTLR start "rule__SistemaOperativo__Group__14"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:973:1: rule__SistemaOperativo__Group__14 : rule__SistemaOperativo__Group__14__Impl rule__SistemaOperativo__Group__15 ;
    public final void rule__SistemaOperativo__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:977:1: ( rule__SistemaOperativo__Group__14__Impl rule__SistemaOperativo__Group__15 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:978:2: rule__SistemaOperativo__Group__14__Impl rule__SistemaOperativo__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_rule__SistemaOperativo__Group__14__Impl_in_rule__SistemaOperativo__Group__141925);
            rule__SistemaOperativo__Group__14__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SistemaOperativo__Group__15_in_rule__SistemaOperativo__Group__141928);
            rule__SistemaOperativo__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SistemaOperativo__Group__14"


    // $ANTLR start "rule__SistemaOperativo__Group__14__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:985:1: rule__SistemaOperativo__Group__14__Impl : ( '}' ) ;
    public final void rule__SistemaOperativo__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:989:1: ( ( '}' ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:990:1: ( '}' )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:990:1: ( '}' )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:991:1: '}'
            {
             before(grammarAccess.getSistemaOperativoAccess().getRightCurlyBracketKeyword_14()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__SistemaOperativo__Group__14__Impl1956); 
             after(grammarAccess.getSistemaOperativoAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SistemaOperativo__Group__14__Impl"


    // $ANTLR start "rule__SistemaOperativo__Group__15"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1004:1: rule__SistemaOperativo__Group__15 : rule__SistemaOperativo__Group__15__Impl ;
    public final void rule__SistemaOperativo__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1008:1: ( rule__SistemaOperativo__Group__15__Impl )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1009:2: rule__SistemaOperativo__Group__15__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SistemaOperativo__Group__15__Impl_in_rule__SistemaOperativo__Group__151987);
            rule__SistemaOperativo__Group__15__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SistemaOperativo__Group__15"


    // $ANTLR start "rule__SistemaOperativo__Group__15__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1015:1: rule__SistemaOperativo__Group__15__Impl : ( '}' ) ;
    public final void rule__SistemaOperativo__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1019:1: ( ( '}' ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1020:1: ( '}' )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1020:1: ( '}' )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1021:1: '}'
            {
             before(grammarAccess.getSistemaOperativoAccess().getRightCurlyBracketKeyword_15()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__SistemaOperativo__Group__15__Impl2015); 
             after(grammarAccess.getSistemaOperativoAccess().getRightCurlyBracketKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SistemaOperativo__Group__15__Impl"


    // $ANTLR start "rule__SistemaOperativo__Group_9__0"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1066:1: rule__SistemaOperativo__Group_9__0 : rule__SistemaOperativo__Group_9__0__Impl rule__SistemaOperativo__Group_9__1 ;
    public final void rule__SistemaOperativo__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1070:1: ( rule__SistemaOperativo__Group_9__0__Impl rule__SistemaOperativo__Group_9__1 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1071:2: rule__SistemaOperativo__Group_9__0__Impl rule__SistemaOperativo__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SistemaOperativo__Group_9__0__Impl_in_rule__SistemaOperativo__Group_9__02078);
            rule__SistemaOperativo__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SistemaOperativo__Group_9__1_in_rule__SistemaOperativo__Group_9__02081);
            rule__SistemaOperativo__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SistemaOperativo__Group_9__0"


    // $ANTLR start "rule__SistemaOperativo__Group_9__0__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1078:1: rule__SistemaOperativo__Group_9__0__Impl : ( 'fuentes' ) ;
    public final void rule__SistemaOperativo__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1082:1: ( ( 'fuentes' ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1083:1: ( 'fuentes' )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1083:1: ( 'fuentes' )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1084:1: 'fuentes'
            {
             before(grammarAccess.getSistemaOperativoAccess().getFuentesKeyword_9_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__SistemaOperativo__Group_9__0__Impl2109); 
             after(grammarAccess.getSistemaOperativoAccess().getFuentesKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SistemaOperativo__Group_9__0__Impl"


    // $ANTLR start "rule__SistemaOperativo__Group_9__1"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1097:1: rule__SistemaOperativo__Group_9__1 : rule__SistemaOperativo__Group_9__1__Impl rule__SistemaOperativo__Group_9__2 ;
    public final void rule__SistemaOperativo__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1101:1: ( rule__SistemaOperativo__Group_9__1__Impl rule__SistemaOperativo__Group_9__2 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1102:2: rule__SistemaOperativo__Group_9__1__Impl rule__SistemaOperativo__Group_9__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SistemaOperativo__Group_9__1__Impl_in_rule__SistemaOperativo__Group_9__12140);
            rule__SistemaOperativo__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SistemaOperativo__Group_9__2_in_rule__SistemaOperativo__Group_9__12143);
            rule__SistemaOperativo__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SistemaOperativo__Group_9__1"


    // $ANTLR start "rule__SistemaOperativo__Group_9__1__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1109:1: rule__SistemaOperativo__Group_9__1__Impl : ( '{' ) ;
    public final void rule__SistemaOperativo__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1113:1: ( ( '{' ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1114:1: ( '{' )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1114:1: ( '{' )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1115:1: '{'
            {
             before(grammarAccess.getSistemaOperativoAccess().getLeftCurlyBracketKeyword_9_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__SistemaOperativo__Group_9__1__Impl2171); 
             after(grammarAccess.getSistemaOperativoAccess().getLeftCurlyBracketKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SistemaOperativo__Group_9__1__Impl"


    // $ANTLR start "rule__SistemaOperativo__Group_9__2"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1128:1: rule__SistemaOperativo__Group_9__2 : rule__SistemaOperativo__Group_9__2__Impl rule__SistemaOperativo__Group_9__3 ;
    public final void rule__SistemaOperativo__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1132:1: ( rule__SistemaOperativo__Group_9__2__Impl rule__SistemaOperativo__Group_9__3 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1133:2: rule__SistemaOperativo__Group_9__2__Impl rule__SistemaOperativo__Group_9__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SistemaOperativo__Group_9__2__Impl_in_rule__SistemaOperativo__Group_9__22202);
            rule__SistemaOperativo__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SistemaOperativo__Group_9__3_in_rule__SistemaOperativo__Group_9__22205);
            rule__SistemaOperativo__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SistemaOperativo__Group_9__2"


    // $ANTLR start "rule__SistemaOperativo__Group_9__2__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1140:1: rule__SistemaOperativo__Group_9__2__Impl : ( ( rule__SistemaOperativo__FuentesAssignment_9_2 ) ) ;
    public final void rule__SistemaOperativo__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1144:1: ( ( ( rule__SistemaOperativo__FuentesAssignment_9_2 ) ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1145:1: ( ( rule__SistemaOperativo__FuentesAssignment_9_2 ) )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1145:1: ( ( rule__SistemaOperativo__FuentesAssignment_9_2 ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1146:1: ( rule__SistemaOperativo__FuentesAssignment_9_2 )
            {
             before(grammarAccess.getSistemaOperativoAccess().getFuentesAssignment_9_2()); 
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1147:1: ( rule__SistemaOperativo__FuentesAssignment_9_2 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1147:2: rule__SistemaOperativo__FuentesAssignment_9_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SistemaOperativo__FuentesAssignment_9_2_in_rule__SistemaOperativo__Group_9__2__Impl2232);
            rule__SistemaOperativo__FuentesAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getSistemaOperativoAccess().getFuentesAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SistemaOperativo__Group_9__2__Impl"


    // $ANTLR start "rule__SistemaOperativo__Group_9__3"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1157:1: rule__SistemaOperativo__Group_9__3 : rule__SistemaOperativo__Group_9__3__Impl rule__SistemaOperativo__Group_9__4 ;
    public final void rule__SistemaOperativo__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1161:1: ( rule__SistemaOperativo__Group_9__3__Impl rule__SistemaOperativo__Group_9__4 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1162:2: rule__SistemaOperativo__Group_9__3__Impl rule__SistemaOperativo__Group_9__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__SistemaOperativo__Group_9__3__Impl_in_rule__SistemaOperativo__Group_9__32262);
            rule__SistemaOperativo__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SistemaOperativo__Group_9__4_in_rule__SistemaOperativo__Group_9__32265);
            rule__SistemaOperativo__Group_9__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SistemaOperativo__Group_9__3"


    // $ANTLR start "rule__SistemaOperativo__Group_9__3__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1169:1: rule__SistemaOperativo__Group_9__3__Impl : ( ( rule__SistemaOperativo__FuentesAssignment_9_3 )* ) ;
    public final void rule__SistemaOperativo__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1173:1: ( ( ( rule__SistemaOperativo__FuentesAssignment_9_3 )* ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1174:1: ( ( rule__SistemaOperativo__FuentesAssignment_9_3 )* )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1174:1: ( ( rule__SistemaOperativo__FuentesAssignment_9_3 )* )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1175:1: ( rule__SistemaOperativo__FuentesAssignment_9_3 )*
            {
             before(grammarAccess.getSistemaOperativoAccess().getFuentesAssignment_9_3()); 
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1176:1: ( rule__SistemaOperativo__FuentesAssignment_9_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1176:2: rule__SistemaOperativo__FuentesAssignment_9_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__SistemaOperativo__FuentesAssignment_9_3_in_rule__SistemaOperativo__Group_9__3__Impl2292);
            	    rule__SistemaOperativo__FuentesAssignment_9_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getSistemaOperativoAccess().getFuentesAssignment_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SistemaOperativo__Group_9__3__Impl"


    // $ANTLR start "rule__SistemaOperativo__Group_9__4"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1186:1: rule__SistemaOperativo__Group_9__4 : rule__SistemaOperativo__Group_9__4__Impl ;
    public final void rule__SistemaOperativo__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1190:1: ( rule__SistemaOperativo__Group_9__4__Impl )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1191:2: rule__SistemaOperativo__Group_9__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SistemaOperativo__Group_9__4__Impl_in_rule__SistemaOperativo__Group_9__42323);
            rule__SistemaOperativo__Group_9__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SistemaOperativo__Group_9__4"


    // $ANTLR start "rule__SistemaOperativo__Group_9__4__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1197:1: rule__SistemaOperativo__Group_9__4__Impl : ( '}' ) ;
    public final void rule__SistemaOperativo__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1201:1: ( ( '}' ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1202:1: ( '}' )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1202:1: ( '}' )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1203:1: '}'
            {
             before(grammarAccess.getSistemaOperativoAccess().getRightCurlyBracketKeyword_9_4()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__SistemaOperativo__Group_9__4__Impl2351); 
             after(grammarAccess.getSistemaOperativoAccess().getRightCurlyBracketKeyword_9_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SistemaOperativo__Group_9__4__Impl"


    // $ANTLR start "rule__Fuentes__Group__0"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1226:1: rule__Fuentes__Group__0 : rule__Fuentes__Group__0__Impl rule__Fuentes__Group__1 ;
    public final void rule__Fuentes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1230:1: ( rule__Fuentes__Group__0__Impl rule__Fuentes__Group__1 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1231:2: rule__Fuentes__Group__0__Impl rule__Fuentes__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fuentes__Group__0__Impl_in_rule__Fuentes__Group__02392);
            rule__Fuentes__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fuentes__Group__1_in_rule__Fuentes__Group__02395);
            rule__Fuentes__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fuentes__Group__0"


    // $ANTLR start "rule__Fuentes__Group__0__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1238:1: rule__Fuentes__Group__0__Impl : ( () ) ;
    public final void rule__Fuentes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1242:1: ( ( () ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1243:1: ( () )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1243:1: ( () )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1244:1: ()
            {
             before(grammarAccess.getFuentesAccess().getFuentesAction_0()); 
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1245:1: ()
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1247:1: 
            {
            }

             after(grammarAccess.getFuentesAccess().getFuentesAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fuentes__Group__0__Impl"


    // $ANTLR start "rule__Fuentes__Group__1"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1257:1: rule__Fuentes__Group__1 : rule__Fuentes__Group__1__Impl rule__Fuentes__Group__2 ;
    public final void rule__Fuentes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1261:1: ( rule__Fuentes__Group__1__Impl rule__Fuentes__Group__2 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1262:2: rule__Fuentes__Group__1__Impl rule__Fuentes__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fuentes__Group__1__Impl_in_rule__Fuentes__Group__12453);
            rule__Fuentes__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fuentes__Group__2_in_rule__Fuentes__Group__12456);
            rule__Fuentes__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fuentes__Group__1"


    // $ANTLR start "rule__Fuentes__Group__1__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1269:1: rule__Fuentes__Group__1__Impl : ( 'Fuente' ) ;
    public final void rule__Fuentes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1273:1: ( ( 'Fuente' ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1274:1: ( 'Fuente' )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1274:1: ( 'Fuente' )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1275:1: 'Fuente'
            {
             before(grammarAccess.getFuentesAccess().getFuenteKeyword_1()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Fuentes__Group__1__Impl2484); 
             after(grammarAccess.getFuentesAccess().getFuenteKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fuentes__Group__1__Impl"


    // $ANTLR start "rule__Fuentes__Group__2"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1288:1: rule__Fuentes__Group__2 : rule__Fuentes__Group__2__Impl rule__Fuentes__Group__3 ;
    public final void rule__Fuentes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1292:1: ( rule__Fuentes__Group__2__Impl rule__Fuentes__Group__3 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1293:2: rule__Fuentes__Group__2__Impl rule__Fuentes__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fuentes__Group__2__Impl_in_rule__Fuentes__Group__22515);
            rule__Fuentes__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fuentes__Group__3_in_rule__Fuentes__Group__22518);
            rule__Fuentes__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fuentes__Group__2"


    // $ANTLR start "rule__Fuentes__Group__2__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1300:1: rule__Fuentes__Group__2__Impl : ( '=' ) ;
    public final void rule__Fuentes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1304:1: ( ( '=' ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1305:1: ( '=' )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1305:1: ( '=' )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1306:1: '='
            {
             before(grammarAccess.getFuentesAccess().getEqualsSignKeyword_2()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Fuentes__Group__2__Impl2546); 
             after(grammarAccess.getFuentesAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fuentes__Group__2__Impl"


    // $ANTLR start "rule__Fuentes__Group__3"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1319:1: rule__Fuentes__Group__3 : rule__Fuentes__Group__3__Impl rule__Fuentes__Group__4 ;
    public final void rule__Fuentes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1323:1: ( rule__Fuentes__Group__3__Impl rule__Fuentes__Group__4 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1324:2: rule__Fuentes__Group__3__Impl rule__Fuentes__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fuentes__Group__3__Impl_in_rule__Fuentes__Group__32577);
            rule__Fuentes__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fuentes__Group__4_in_rule__Fuentes__Group__32580);
            rule__Fuentes__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fuentes__Group__3"


    // $ANTLR start "rule__Fuentes__Group__3__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1331:1: rule__Fuentes__Group__3__Impl : ( ( rule__Fuentes__NameAssignment_3 ) ) ;
    public final void rule__Fuentes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1335:1: ( ( ( rule__Fuentes__NameAssignment_3 ) ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1336:1: ( ( rule__Fuentes__NameAssignment_3 ) )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1336:1: ( ( rule__Fuentes__NameAssignment_3 ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1337:1: ( rule__Fuentes__NameAssignment_3 )
            {
             before(grammarAccess.getFuentesAccess().getNameAssignment_3()); 
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1338:1: ( rule__Fuentes__NameAssignment_3 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1338:2: rule__Fuentes__NameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fuentes__NameAssignment_3_in_rule__Fuentes__Group__3__Impl2607);
            rule__Fuentes__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFuentesAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fuentes__Group__3__Impl"


    // $ANTLR start "rule__Fuentes__Group__4"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1348:1: rule__Fuentes__Group__4 : rule__Fuentes__Group__4__Impl rule__Fuentes__Group__5 ;
    public final void rule__Fuentes__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1352:1: ( rule__Fuentes__Group__4__Impl rule__Fuentes__Group__5 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1353:2: rule__Fuentes__Group__4__Impl rule__Fuentes__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fuentes__Group__4__Impl_in_rule__Fuentes__Group__42637);
            rule__Fuentes__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fuentes__Group__5_in_rule__Fuentes__Group__42640);
            rule__Fuentes__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fuentes__Group__4"


    // $ANTLR start "rule__Fuentes__Group__4__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1360:1: rule__Fuentes__Group__4__Impl : ( ',' ) ;
    public final void rule__Fuentes__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1364:1: ( ( ',' ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1365:1: ( ',' )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1365:1: ( ',' )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1366:1: ','
            {
             before(grammarAccess.getFuentesAccess().getCommaKeyword_4()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Fuentes__Group__4__Impl2668); 
             after(grammarAccess.getFuentesAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fuentes__Group__4__Impl"


    // $ANTLR start "rule__Fuentes__Group__5"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1379:1: rule__Fuentes__Group__5 : rule__Fuentes__Group__5__Impl rule__Fuentes__Group__6 ;
    public final void rule__Fuentes__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1383:1: ( rule__Fuentes__Group__5__Impl rule__Fuentes__Group__6 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1384:2: rule__Fuentes__Group__5__Impl rule__Fuentes__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fuentes__Group__5__Impl_in_rule__Fuentes__Group__52699);
            rule__Fuentes__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fuentes__Group__6_in_rule__Fuentes__Group__52702);
            rule__Fuentes__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fuentes__Group__5"


    // $ANTLR start "rule__Fuentes__Group__5__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1391:1: rule__Fuentes__Group__5__Impl : ( 'autor:' ) ;
    public final void rule__Fuentes__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1395:1: ( ( 'autor:' ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1396:1: ( 'autor:' )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1396:1: ( 'autor:' )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1397:1: 'autor:'
            {
             before(grammarAccess.getFuentesAccess().getAutorKeyword_5()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Fuentes__Group__5__Impl2730); 
             after(grammarAccess.getFuentesAccess().getAutorKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fuentes__Group__5__Impl"


    // $ANTLR start "rule__Fuentes__Group__6"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1410:1: rule__Fuentes__Group__6 : rule__Fuentes__Group__6__Impl rule__Fuentes__Group__7 ;
    public final void rule__Fuentes__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1414:1: ( rule__Fuentes__Group__6__Impl rule__Fuentes__Group__7 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1415:2: rule__Fuentes__Group__6__Impl rule__Fuentes__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fuentes__Group__6__Impl_in_rule__Fuentes__Group__62761);
            rule__Fuentes__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fuentes__Group__7_in_rule__Fuentes__Group__62764);
            rule__Fuentes__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fuentes__Group__6"


    // $ANTLR start "rule__Fuentes__Group__6__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1422:1: rule__Fuentes__Group__6__Impl : ( ( rule__Fuentes__AutorAssignment_6 ) ) ;
    public final void rule__Fuentes__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1426:1: ( ( ( rule__Fuentes__AutorAssignment_6 ) ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1427:1: ( ( rule__Fuentes__AutorAssignment_6 ) )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1427:1: ( ( rule__Fuentes__AutorAssignment_6 ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1428:1: ( rule__Fuentes__AutorAssignment_6 )
            {
             before(grammarAccess.getFuentesAccess().getAutorAssignment_6()); 
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1429:1: ( rule__Fuentes__AutorAssignment_6 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1429:2: rule__Fuentes__AutorAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fuentes__AutorAssignment_6_in_rule__Fuentes__Group__6__Impl2791);
            rule__Fuentes__AutorAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getFuentesAccess().getAutorAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fuentes__Group__6__Impl"


    // $ANTLR start "rule__Fuentes__Group__7"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1439:1: rule__Fuentes__Group__7 : rule__Fuentes__Group__7__Impl rule__Fuentes__Group__8 ;
    public final void rule__Fuentes__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1443:1: ( rule__Fuentes__Group__7__Impl rule__Fuentes__Group__8 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1444:2: rule__Fuentes__Group__7__Impl rule__Fuentes__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fuentes__Group__7__Impl_in_rule__Fuentes__Group__72821);
            rule__Fuentes__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fuentes__Group__8_in_rule__Fuentes__Group__72824);
            rule__Fuentes__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fuentes__Group__7"


    // $ANTLR start "rule__Fuentes__Group__7__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1451:1: rule__Fuentes__Group__7__Impl : ( ',' ) ;
    public final void rule__Fuentes__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1455:1: ( ( ',' ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1456:1: ( ',' )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1456:1: ( ',' )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1457:1: ','
            {
             before(grammarAccess.getFuentesAccess().getCommaKeyword_7()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Fuentes__Group__7__Impl2852); 
             after(grammarAccess.getFuentesAccess().getCommaKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fuentes__Group__7__Impl"


    // $ANTLR start "rule__Fuentes__Group__8"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1470:1: rule__Fuentes__Group__8 : rule__Fuentes__Group__8__Impl rule__Fuentes__Group__9 ;
    public final void rule__Fuentes__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1474:1: ( rule__Fuentes__Group__8__Impl rule__Fuentes__Group__9 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1475:2: rule__Fuentes__Group__8__Impl rule__Fuentes__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fuentes__Group__8__Impl_in_rule__Fuentes__Group__82883);
            rule__Fuentes__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fuentes__Group__9_in_rule__Fuentes__Group__82886);
            rule__Fuentes__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fuentes__Group__8"


    // $ANTLR start "rule__Fuentes__Group__8__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1482:1: rule__Fuentes__Group__8__Impl : ( 'fuente:' ) ;
    public final void rule__Fuentes__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1486:1: ( ( 'fuente:' ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1487:1: ( 'fuente:' )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1487:1: ( 'fuente:' )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1488:1: 'fuente:'
            {
             before(grammarAccess.getFuentesAccess().getFuenteKeyword_8()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Fuentes__Group__8__Impl2914); 
             after(grammarAccess.getFuentesAccess().getFuenteKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fuentes__Group__8__Impl"


    // $ANTLR start "rule__Fuentes__Group__9"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1501:1: rule__Fuentes__Group__9 : rule__Fuentes__Group__9__Impl rule__Fuentes__Group__10 ;
    public final void rule__Fuentes__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1505:1: ( rule__Fuentes__Group__9__Impl rule__Fuentes__Group__10 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1506:2: rule__Fuentes__Group__9__Impl rule__Fuentes__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fuentes__Group__9__Impl_in_rule__Fuentes__Group__92945);
            rule__Fuentes__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fuentes__Group__10_in_rule__Fuentes__Group__92948);
            rule__Fuentes__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fuentes__Group__9"


    // $ANTLR start "rule__Fuentes__Group__9__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1513:1: rule__Fuentes__Group__9__Impl : ( ( rule__Fuentes__FuenteAssignment_9 ) ) ;
    public final void rule__Fuentes__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1517:1: ( ( ( rule__Fuentes__FuenteAssignment_9 ) ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1518:1: ( ( rule__Fuentes__FuenteAssignment_9 ) )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1518:1: ( ( rule__Fuentes__FuenteAssignment_9 ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1519:1: ( rule__Fuentes__FuenteAssignment_9 )
            {
             before(grammarAccess.getFuentesAccess().getFuenteAssignment_9()); 
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1520:1: ( rule__Fuentes__FuenteAssignment_9 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1520:2: rule__Fuentes__FuenteAssignment_9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fuentes__FuenteAssignment_9_in_rule__Fuentes__Group__9__Impl2975);
            rule__Fuentes__FuenteAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getFuentesAccess().getFuenteAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fuentes__Group__9__Impl"


    // $ANTLR start "rule__Fuentes__Group__10"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1530:1: rule__Fuentes__Group__10 : rule__Fuentes__Group__10__Impl rule__Fuentes__Group__11 ;
    public final void rule__Fuentes__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1534:1: ( rule__Fuentes__Group__10__Impl rule__Fuentes__Group__11 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1535:2: rule__Fuentes__Group__10__Impl rule__Fuentes__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fuentes__Group__10__Impl_in_rule__Fuentes__Group__103005);
            rule__Fuentes__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fuentes__Group__11_in_rule__Fuentes__Group__103008);
            rule__Fuentes__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fuentes__Group__10"


    // $ANTLR start "rule__Fuentes__Group__10__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1542:1: rule__Fuentes__Group__10__Impl : ( ',' ) ;
    public final void rule__Fuentes__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1546:1: ( ( ',' ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1547:1: ( ',' )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1547:1: ( ',' )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1548:1: ','
            {
             before(grammarAccess.getFuentesAccess().getCommaKeyword_10()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Fuentes__Group__10__Impl3036); 
             after(grammarAccess.getFuentesAccess().getCommaKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fuentes__Group__10__Impl"


    // $ANTLR start "rule__Fuentes__Group__11"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1561:1: rule__Fuentes__Group__11 : rule__Fuentes__Group__11__Impl rule__Fuentes__Group__12 ;
    public final void rule__Fuentes__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1565:1: ( rule__Fuentes__Group__11__Impl rule__Fuentes__Group__12 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1566:2: rule__Fuentes__Group__11__Impl rule__Fuentes__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fuentes__Group__11__Impl_in_rule__Fuentes__Group__113067);
            rule__Fuentes__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fuentes__Group__12_in_rule__Fuentes__Group__113070);
            rule__Fuentes__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fuentes__Group__11"


    // $ANTLR start "rule__Fuentes__Group__11__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1573:1: rule__Fuentes__Group__11__Impl : ( 'tipoFuente:' ) ;
    public final void rule__Fuentes__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1577:1: ( ( 'tipoFuente:' ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1578:1: ( 'tipoFuente:' )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1578:1: ( 'tipoFuente:' )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1579:1: 'tipoFuente:'
            {
             before(grammarAccess.getFuentesAccess().getTipoFuenteKeyword_11()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Fuentes__Group__11__Impl3098); 
             after(grammarAccess.getFuentesAccess().getTipoFuenteKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fuentes__Group__11__Impl"


    // $ANTLR start "rule__Fuentes__Group__12"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1592:1: rule__Fuentes__Group__12 : rule__Fuentes__Group__12__Impl rule__Fuentes__Group__13 ;
    public final void rule__Fuentes__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1596:1: ( rule__Fuentes__Group__12__Impl rule__Fuentes__Group__13 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1597:2: rule__Fuentes__Group__12__Impl rule__Fuentes__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fuentes__Group__12__Impl_in_rule__Fuentes__Group__123129);
            rule__Fuentes__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Fuentes__Group__13_in_rule__Fuentes__Group__123132);
            rule__Fuentes__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fuentes__Group__12"


    // $ANTLR start "rule__Fuentes__Group__12__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1604:1: rule__Fuentes__Group__12__Impl : ( ( rule__Fuentes__TipoFuenteAssignment_12 ) ) ;
    public final void rule__Fuentes__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1608:1: ( ( ( rule__Fuentes__TipoFuenteAssignment_12 ) ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1609:1: ( ( rule__Fuentes__TipoFuenteAssignment_12 ) )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1609:1: ( ( rule__Fuentes__TipoFuenteAssignment_12 ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1610:1: ( rule__Fuentes__TipoFuenteAssignment_12 )
            {
             before(grammarAccess.getFuentesAccess().getTipoFuenteAssignment_12()); 
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1611:1: ( rule__Fuentes__TipoFuenteAssignment_12 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1611:2: rule__Fuentes__TipoFuenteAssignment_12
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fuentes__TipoFuenteAssignment_12_in_rule__Fuentes__Group__12__Impl3159);
            rule__Fuentes__TipoFuenteAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getFuentesAccess().getTipoFuenteAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fuentes__Group__12__Impl"


    // $ANTLR start "rule__Fuentes__Group__13"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1621:1: rule__Fuentes__Group__13 : rule__Fuentes__Group__13__Impl ;
    public final void rule__Fuentes__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1625:1: ( rule__Fuentes__Group__13__Impl )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1626:2: rule__Fuentes__Group__13__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Fuentes__Group__13__Impl_in_rule__Fuentes__Group__133189);
            rule__Fuentes__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fuentes__Group__13"


    // $ANTLR start "rule__Fuentes__Group__13__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1632:1: rule__Fuentes__Group__13__Impl : ( ';' ) ;
    public final void rule__Fuentes__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1636:1: ( ( ';' ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1637:1: ( ';' )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1637:1: ( ';' )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1638:1: ';'
            {
             before(grammarAccess.getFuentesAccess().getSemicolonKeyword_13()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Fuentes__Group__13__Impl3217); 
             after(grammarAccess.getFuentesAccess().getSemicolonKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fuentes__Group__13__Impl"


    // $ANTLR start "rule__Software__Group__0"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1679:1: rule__Software__Group__0 : rule__Software__Group__0__Impl rule__Software__Group__1 ;
    public final void rule__Software__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1683:1: ( rule__Software__Group__0__Impl rule__Software__Group__1 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1684:2: rule__Software__Group__0__Impl rule__Software__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Software__Group__0__Impl_in_rule__Software__Group__03276);
            rule__Software__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Software__Group__1_in_rule__Software__Group__03279);
            rule__Software__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group__0"


    // $ANTLR start "rule__Software__Group__0__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1691:1: rule__Software__Group__0__Impl : ( () ) ;
    public final void rule__Software__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1695:1: ( ( () ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1696:1: ( () )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1696:1: ( () )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1697:1: ()
            {
             before(grammarAccess.getSoftwareAccess().getSoftwareAction_0()); 
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1698:1: ()
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1700:1: 
            {
            }

             after(grammarAccess.getSoftwareAccess().getSoftwareAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group__0__Impl"


    // $ANTLR start "rule__Software__Group__1"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1710:1: rule__Software__Group__1 : rule__Software__Group__1__Impl rule__Software__Group__2 ;
    public final void rule__Software__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1714:1: ( rule__Software__Group__1__Impl rule__Software__Group__2 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1715:2: rule__Software__Group__1__Impl rule__Software__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Software__Group__1__Impl_in_rule__Software__Group__13337);
            rule__Software__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Software__Group__2_in_rule__Software__Group__13340);
            rule__Software__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group__1"


    // $ANTLR start "rule__Software__Group__1__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1722:1: rule__Software__Group__1__Impl : ( 'Software' ) ;
    public final void rule__Software__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1726:1: ( ( 'Software' ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1727:1: ( 'Software' )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1727:1: ( 'Software' )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1728:1: 'Software'
            {
             before(grammarAccess.getSoftwareAccess().getSoftwareKeyword_1()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Software__Group__1__Impl3368); 
             after(grammarAccess.getSoftwareAccess().getSoftwareKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group__1__Impl"


    // $ANTLR start "rule__Software__Group__2"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1741:1: rule__Software__Group__2 : rule__Software__Group__2__Impl rule__Software__Group__3 ;
    public final void rule__Software__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1745:1: ( rule__Software__Group__2__Impl rule__Software__Group__3 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1746:2: rule__Software__Group__2__Impl rule__Software__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Software__Group__2__Impl_in_rule__Software__Group__23399);
            rule__Software__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Software__Group__3_in_rule__Software__Group__23402);
            rule__Software__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group__2"


    // $ANTLR start "rule__Software__Group__2__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1753:1: rule__Software__Group__2__Impl : ( '=' ) ;
    public final void rule__Software__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1757:1: ( ( '=' ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1758:1: ( '=' )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1758:1: ( '=' )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1759:1: '='
            {
             before(grammarAccess.getSoftwareAccess().getEqualsSignKeyword_2()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Software__Group__2__Impl3430); 
             after(grammarAccess.getSoftwareAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group__2__Impl"


    // $ANTLR start "rule__Software__Group__3"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1772:1: rule__Software__Group__3 : rule__Software__Group__3__Impl rule__Software__Group__4 ;
    public final void rule__Software__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1776:1: ( rule__Software__Group__3__Impl rule__Software__Group__4 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1777:2: rule__Software__Group__3__Impl rule__Software__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Software__Group__3__Impl_in_rule__Software__Group__33461);
            rule__Software__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Software__Group__4_in_rule__Software__Group__33464);
            rule__Software__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group__3"


    // $ANTLR start "rule__Software__Group__3__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1784:1: rule__Software__Group__3__Impl : ( ( rule__Software__NameAssignment_3 ) ) ;
    public final void rule__Software__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1788:1: ( ( ( rule__Software__NameAssignment_3 ) ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1789:1: ( ( rule__Software__NameAssignment_3 ) )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1789:1: ( ( rule__Software__NameAssignment_3 ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1790:1: ( rule__Software__NameAssignment_3 )
            {
             before(grammarAccess.getSoftwareAccess().getNameAssignment_3()); 
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1791:1: ( rule__Software__NameAssignment_3 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1791:2: rule__Software__NameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Software__NameAssignment_3_in_rule__Software__Group__3__Impl3491);
            rule__Software__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSoftwareAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group__3__Impl"


    // $ANTLR start "rule__Software__Group__4"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1801:1: rule__Software__Group__4 : rule__Software__Group__4__Impl rule__Software__Group__5 ;
    public final void rule__Software__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1805:1: ( rule__Software__Group__4__Impl rule__Software__Group__5 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1806:2: rule__Software__Group__4__Impl rule__Software__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Software__Group__4__Impl_in_rule__Software__Group__43521);
            rule__Software__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Software__Group__5_in_rule__Software__Group__43524);
            rule__Software__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group__4"


    // $ANTLR start "rule__Software__Group__4__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1813:1: rule__Software__Group__4__Impl : ( ( rule__Software__Group_4__0 )? ) ;
    public final void rule__Software__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1817:1: ( ( ( rule__Software__Group_4__0 )? ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1818:1: ( ( rule__Software__Group_4__0 )? )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1818:1: ( ( rule__Software__Group_4__0 )? )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1819:1: ( rule__Software__Group_4__0 )?
            {
             before(grammarAccess.getSoftwareAccess().getGroup_4()); 
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1820:1: ( rule__Software__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==30) ) {
                    alt8=1;
                }
            }
            switch (alt8) {
                case 1 :
                    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1820:2: rule__Software__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Software__Group_4__0_in_rule__Software__Group__4__Impl3551);
                    rule__Software__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSoftwareAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group__4__Impl"


    // $ANTLR start "rule__Software__Group__5"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1830:1: rule__Software__Group__5 : rule__Software__Group__5__Impl rule__Software__Group__6 ;
    public final void rule__Software__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1834:1: ( rule__Software__Group__5__Impl rule__Software__Group__6 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1835:2: rule__Software__Group__5__Impl rule__Software__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Software__Group__5__Impl_in_rule__Software__Group__53582);
            rule__Software__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Software__Group__6_in_rule__Software__Group__53585);
            rule__Software__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group__5"


    // $ANTLR start "rule__Software__Group__5__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1842:1: rule__Software__Group__5__Impl : ( ( rule__Software__Group_5__0 )? ) ;
    public final void rule__Software__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1846:1: ( ( ( rule__Software__Group_5__0 )? ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1847:1: ( ( rule__Software__Group_5__0 )? )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1847:1: ( ( rule__Software__Group_5__0 )? )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1848:1: ( rule__Software__Group_5__0 )?
            {
             before(grammarAccess.getSoftwareAccess().getGroup_5()); 
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1849:1: ( rule__Software__Group_5__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==31) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1849:2: rule__Software__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Software__Group_5__0_in_rule__Software__Group__5__Impl3612);
                    rule__Software__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSoftwareAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group__5__Impl"


    // $ANTLR start "rule__Software__Group__6"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1859:1: rule__Software__Group__6 : rule__Software__Group__6__Impl rule__Software__Group__7 ;
    public final void rule__Software__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1863:1: ( rule__Software__Group__6__Impl rule__Software__Group__7 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1864:2: rule__Software__Group__6__Impl rule__Software__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Software__Group__6__Impl_in_rule__Software__Group__63643);
            rule__Software__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Software__Group__7_in_rule__Software__Group__63646);
            rule__Software__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group__6"


    // $ANTLR start "rule__Software__Group__6__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1871:1: rule__Software__Group__6__Impl : ( ',' ) ;
    public final void rule__Software__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1875:1: ( ( ',' ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1876:1: ( ',' )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1876:1: ( ',' )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1877:1: ','
            {
             before(grammarAccess.getSoftwareAccess().getCommaKeyword_6()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Software__Group__6__Impl3674); 
             after(grammarAccess.getSoftwareAccess().getCommaKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group__6__Impl"


    // $ANTLR start "rule__Software__Group__7"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1890:1: rule__Software__Group__7 : rule__Software__Group__7__Impl rule__Software__Group__8 ;
    public final void rule__Software__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1894:1: ( rule__Software__Group__7__Impl rule__Software__Group__8 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1895:2: rule__Software__Group__7__Impl rule__Software__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Software__Group__7__Impl_in_rule__Software__Group__73705);
            rule__Software__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Software__Group__8_in_rule__Software__Group__73708);
            rule__Software__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group__7"


    // $ANTLR start "rule__Software__Group__7__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1902:1: rule__Software__Group__7__Impl : ( 'arquitectura:' ) ;
    public final void rule__Software__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1906:1: ( ( 'arquitectura:' ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1907:1: ( 'arquitectura:' )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1907:1: ( 'arquitectura:' )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1908:1: 'arquitectura:'
            {
             before(grammarAccess.getSoftwareAccess().getArquitecturaKeyword_7()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Software__Group__7__Impl3736); 
             after(grammarAccess.getSoftwareAccess().getArquitecturaKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group__7__Impl"


    // $ANTLR start "rule__Software__Group__8"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1921:1: rule__Software__Group__8 : rule__Software__Group__8__Impl rule__Software__Group__9 ;
    public final void rule__Software__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1925:1: ( rule__Software__Group__8__Impl rule__Software__Group__9 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1926:2: rule__Software__Group__8__Impl rule__Software__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Software__Group__8__Impl_in_rule__Software__Group__83767);
            rule__Software__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Software__Group__9_in_rule__Software__Group__83770);
            rule__Software__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group__8"


    // $ANTLR start "rule__Software__Group__8__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1933:1: rule__Software__Group__8__Impl : ( ( rule__Software__ArquitecturaAssignment_8 ) ) ;
    public final void rule__Software__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1937:1: ( ( ( rule__Software__ArquitecturaAssignment_8 ) ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1938:1: ( ( rule__Software__ArquitecturaAssignment_8 ) )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1938:1: ( ( rule__Software__ArquitecturaAssignment_8 ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1939:1: ( rule__Software__ArquitecturaAssignment_8 )
            {
             before(grammarAccess.getSoftwareAccess().getArquitecturaAssignment_8()); 
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1940:1: ( rule__Software__ArquitecturaAssignment_8 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1940:2: rule__Software__ArquitecturaAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Software__ArquitecturaAssignment_8_in_rule__Software__Group__8__Impl3797);
            rule__Software__ArquitecturaAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getSoftwareAccess().getArquitecturaAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group__8__Impl"


    // $ANTLR start "rule__Software__Group__9"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1950:1: rule__Software__Group__9 : rule__Software__Group__9__Impl rule__Software__Group__10 ;
    public final void rule__Software__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1954:1: ( rule__Software__Group__9__Impl rule__Software__Group__10 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1955:2: rule__Software__Group__9__Impl rule__Software__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Software__Group__9__Impl_in_rule__Software__Group__93827);
            rule__Software__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Software__Group__10_in_rule__Software__Group__93830);
            rule__Software__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group__9"


    // $ANTLR start "rule__Software__Group__9__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1962:1: rule__Software__Group__9__Impl : ( ( rule__Software__Group_9__0 )? ) ;
    public final void rule__Software__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1966:1: ( ( ( rule__Software__Group_9__0 )? ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1967:1: ( ( rule__Software__Group_9__0 )? )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1967:1: ( ( rule__Software__Group_9__0 )? )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1968:1: ( rule__Software__Group_9__0 )?
            {
             before(grammarAccess.getSoftwareAccess().getGroup_9()); 
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1969:1: ( rule__Software__Group_9__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==32) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1969:2: rule__Software__Group_9__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Software__Group_9__0_in_rule__Software__Group__9__Impl3857);
                    rule__Software__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSoftwareAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group__9__Impl"


    // $ANTLR start "rule__Software__Group__10"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1979:1: rule__Software__Group__10 : rule__Software__Group__10__Impl rule__Software__Group__11 ;
    public final void rule__Software__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1983:1: ( rule__Software__Group__10__Impl rule__Software__Group__11 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1984:2: rule__Software__Group__10__Impl rule__Software__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__Software__Group__10__Impl_in_rule__Software__Group__103888);
            rule__Software__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Software__Group__11_in_rule__Software__Group__103891);
            rule__Software__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group__10"


    // $ANTLR start "rule__Software__Group__10__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1991:1: rule__Software__Group__10__Impl : ( ( rule__Software__Group_10__0 )? ) ;
    public final void rule__Software__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1995:1: ( ( ( rule__Software__Group_10__0 )? ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1996:1: ( ( rule__Software__Group_10__0 )? )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1996:1: ( ( rule__Software__Group_10__0 )? )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1997:1: ( rule__Software__Group_10__0 )?
            {
             before(grammarAccess.getSoftwareAccess().getGroup_10()); 
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1998:1: ( rule__Software__Group_10__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==16) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==33) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:1998:2: rule__Software__Group_10__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Software__Group_10__0_in_rule__Software__Group__10__Impl3918);
                    rule__Software__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSoftwareAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group__10__Impl"


    // $ANTLR start "rule__Software__Group__11"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2008:1: rule__Software__Group__11 : rule__Software__Group__11__Impl rule__Software__Group__12 ;
    public final void rule__Software__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2012:1: ( rule__Software__Group__11__Impl rule__Software__Group__12 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2013:2: rule__Software__Group__11__Impl rule__Software__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__Software__Group__11__Impl_in_rule__Software__Group__113949);
            rule__Software__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Software__Group__12_in_rule__Software__Group__113952);
            rule__Software__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group__11"


    // $ANTLR start "rule__Software__Group__11__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2020:1: rule__Software__Group__11__Impl : ( ( rule__Software__Group_11__0 )? ) ;
    public final void rule__Software__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2024:1: ( ( ( rule__Software__Group_11__0 )? ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2025:1: ( ( rule__Software__Group_11__0 )? )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2025:1: ( ( rule__Software__Group_11__0 )? )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2026:1: ( rule__Software__Group_11__0 )?
            {
             before(grammarAccess.getSoftwareAccess().getGroup_11()); 
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2027:1: ( rule__Software__Group_11__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==16) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2027:2: rule__Software__Group_11__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Software__Group_11__0_in_rule__Software__Group__11__Impl3979);
                    rule__Software__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSoftwareAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group__11__Impl"


    // $ANTLR start "rule__Software__Group__12"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2037:1: rule__Software__Group__12 : rule__Software__Group__12__Impl ;
    public final void rule__Software__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2041:1: ( rule__Software__Group__12__Impl )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2042:2: rule__Software__Group__12__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Software__Group__12__Impl_in_rule__Software__Group__124010);
            rule__Software__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group__12"


    // $ANTLR start "rule__Software__Group__12__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2048:1: rule__Software__Group__12__Impl : ( ';' ) ;
    public final void rule__Software__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2052:1: ( ( ';' ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2053:1: ( ';' )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2053:1: ( ';' )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2054:1: ';'
            {
             before(grammarAccess.getSoftwareAccess().getSemicolonKeyword_12()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Software__Group__12__Impl4038); 
             after(grammarAccess.getSoftwareAccess().getSemicolonKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group__12__Impl"


    // $ANTLR start "rule__Software__Group_4__0"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2093:1: rule__Software__Group_4__0 : rule__Software__Group_4__0__Impl rule__Software__Group_4__1 ;
    public final void rule__Software__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2097:1: ( rule__Software__Group_4__0__Impl rule__Software__Group_4__1 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2098:2: rule__Software__Group_4__0__Impl rule__Software__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Software__Group_4__0__Impl_in_rule__Software__Group_4__04095);
            rule__Software__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Software__Group_4__1_in_rule__Software__Group_4__04098);
            rule__Software__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_4__0"


    // $ANTLR start "rule__Software__Group_4__0__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2105:1: rule__Software__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Software__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2109:1: ( ( ',' ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2110:1: ( ',' )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2110:1: ( ',' )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2111:1: ','
            {
             before(grammarAccess.getSoftwareAccess().getCommaKeyword_4_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Software__Group_4__0__Impl4126); 
             after(grammarAccess.getSoftwareAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_4__0__Impl"


    // $ANTLR start "rule__Software__Group_4__1"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2124:1: rule__Software__Group_4__1 : rule__Software__Group_4__1__Impl rule__Software__Group_4__2 ;
    public final void rule__Software__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2128:1: ( rule__Software__Group_4__1__Impl rule__Software__Group_4__2 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2129:2: rule__Software__Group_4__1__Impl rule__Software__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Software__Group_4__1__Impl_in_rule__Software__Group_4__14157);
            rule__Software__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Software__Group_4__2_in_rule__Software__Group_4__14160);
            rule__Software__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_4__1"


    // $ANTLR start "rule__Software__Group_4__1__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2136:1: rule__Software__Group_4__1__Impl : ( 'version:' ) ;
    public final void rule__Software__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2140:1: ( ( 'version:' ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2141:1: ( 'version:' )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2141:1: ( 'version:' )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2142:1: 'version:'
            {
             before(grammarAccess.getSoftwareAccess().getVersionKeyword_4_1()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Software__Group_4__1__Impl4188); 
             after(grammarAccess.getSoftwareAccess().getVersionKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_4__1__Impl"


    // $ANTLR start "rule__Software__Group_4__2"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2155:1: rule__Software__Group_4__2 : rule__Software__Group_4__2__Impl ;
    public final void rule__Software__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2159:1: ( rule__Software__Group_4__2__Impl )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2160:2: rule__Software__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Software__Group_4__2__Impl_in_rule__Software__Group_4__24219);
            rule__Software__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_4__2"


    // $ANTLR start "rule__Software__Group_4__2__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2166:1: rule__Software__Group_4__2__Impl : ( ( rule__Software__VersionAssignment_4_2 ) ) ;
    public final void rule__Software__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2170:1: ( ( ( rule__Software__VersionAssignment_4_2 ) ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2171:1: ( ( rule__Software__VersionAssignment_4_2 ) )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2171:1: ( ( rule__Software__VersionAssignment_4_2 ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2172:1: ( rule__Software__VersionAssignment_4_2 )
            {
             before(grammarAccess.getSoftwareAccess().getVersionAssignment_4_2()); 
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2173:1: ( rule__Software__VersionAssignment_4_2 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2173:2: rule__Software__VersionAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Software__VersionAssignment_4_2_in_rule__Software__Group_4__2__Impl4246);
            rule__Software__VersionAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getSoftwareAccess().getVersionAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_4__2__Impl"


    // $ANTLR start "rule__Software__Group_5__0"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2189:1: rule__Software__Group_5__0 : rule__Software__Group_5__0__Impl rule__Software__Group_5__1 ;
    public final void rule__Software__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2193:1: ( rule__Software__Group_5__0__Impl rule__Software__Group_5__1 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2194:2: rule__Software__Group_5__0__Impl rule__Software__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Software__Group_5__0__Impl_in_rule__Software__Group_5__04282);
            rule__Software__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Software__Group_5__1_in_rule__Software__Group_5__04285);
            rule__Software__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_5__0"


    // $ANTLR start "rule__Software__Group_5__0__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2201:1: rule__Software__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Software__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2205:1: ( ( ',' ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2206:1: ( ',' )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2206:1: ( ',' )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2207:1: ','
            {
             before(grammarAccess.getSoftwareAccess().getCommaKeyword_5_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Software__Group_5__0__Impl4313); 
             after(grammarAccess.getSoftwareAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_5__0__Impl"


    // $ANTLR start "rule__Software__Group_5__1"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2220:1: rule__Software__Group_5__1 : rule__Software__Group_5__1__Impl rule__Software__Group_5__2 ;
    public final void rule__Software__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2224:1: ( rule__Software__Group_5__1__Impl rule__Software__Group_5__2 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2225:2: rule__Software__Group_5__1__Impl rule__Software__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Software__Group_5__1__Impl_in_rule__Software__Group_5__14344);
            rule__Software__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Software__Group_5__2_in_rule__Software__Group_5__14347);
            rule__Software__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_5__1"


    // $ANTLR start "rule__Software__Group_5__1__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2232:1: rule__Software__Group_5__1__Impl : ( 'descripcion:' ) ;
    public final void rule__Software__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2236:1: ( ( 'descripcion:' ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2237:1: ( 'descripcion:' )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2237:1: ( 'descripcion:' )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2238:1: 'descripcion:'
            {
             before(grammarAccess.getSoftwareAccess().getDescripcionKeyword_5_1()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Software__Group_5__1__Impl4375); 
             after(grammarAccess.getSoftwareAccess().getDescripcionKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_5__1__Impl"


    // $ANTLR start "rule__Software__Group_5__2"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2251:1: rule__Software__Group_5__2 : rule__Software__Group_5__2__Impl ;
    public final void rule__Software__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2255:1: ( rule__Software__Group_5__2__Impl )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2256:2: rule__Software__Group_5__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Software__Group_5__2__Impl_in_rule__Software__Group_5__24406);
            rule__Software__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_5__2"


    // $ANTLR start "rule__Software__Group_5__2__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2262:1: rule__Software__Group_5__2__Impl : ( ( rule__Software__DescripcionAssignment_5_2 ) ) ;
    public final void rule__Software__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2266:1: ( ( ( rule__Software__DescripcionAssignment_5_2 ) ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2267:1: ( ( rule__Software__DescripcionAssignment_5_2 ) )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2267:1: ( ( rule__Software__DescripcionAssignment_5_2 ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2268:1: ( rule__Software__DescripcionAssignment_5_2 )
            {
             before(grammarAccess.getSoftwareAccess().getDescripcionAssignment_5_2()); 
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2269:1: ( rule__Software__DescripcionAssignment_5_2 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2269:2: rule__Software__DescripcionAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Software__DescripcionAssignment_5_2_in_rule__Software__Group_5__2__Impl4433);
            rule__Software__DescripcionAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getSoftwareAccess().getDescripcionAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_5__2__Impl"


    // $ANTLR start "rule__Software__Group_9__0"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2285:1: rule__Software__Group_9__0 : rule__Software__Group_9__0__Impl rule__Software__Group_9__1 ;
    public final void rule__Software__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2289:1: ( rule__Software__Group_9__0__Impl rule__Software__Group_9__1 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2290:2: rule__Software__Group_9__0__Impl rule__Software__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Software__Group_9__0__Impl_in_rule__Software__Group_9__04469);
            rule__Software__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Software__Group_9__1_in_rule__Software__Group_9__04472);
            rule__Software__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_9__0"


    // $ANTLR start "rule__Software__Group_9__0__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2297:1: rule__Software__Group_9__0__Impl : ( ',' ) ;
    public final void rule__Software__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2301:1: ( ( ',' ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2302:1: ( ',' )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2302:1: ( ',' )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2303:1: ','
            {
             before(grammarAccess.getSoftwareAccess().getCommaKeyword_9_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Software__Group_9__0__Impl4500); 
             after(grammarAccess.getSoftwareAccess().getCommaKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_9__0__Impl"


    // $ANTLR start "rule__Software__Group_9__1"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2316:1: rule__Software__Group_9__1 : rule__Software__Group_9__1__Impl rule__Software__Group_9__2 ;
    public final void rule__Software__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2320:1: ( rule__Software__Group_9__1__Impl rule__Software__Group_9__2 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2321:2: rule__Software__Group_9__1__Impl rule__Software__Group_9__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Software__Group_9__1__Impl_in_rule__Software__Group_9__14531);
            rule__Software__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Software__Group_9__2_in_rule__Software__Group_9__14534);
            rule__Software__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_9__1"


    // $ANTLR start "rule__Software__Group_9__1__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2328:1: rule__Software__Group_9__1__Impl : ( 'rutaDestino:' ) ;
    public final void rule__Software__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2332:1: ( ( 'rutaDestino:' ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2333:1: ( 'rutaDestino:' )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2333:1: ( 'rutaDestino:' )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2334:1: 'rutaDestino:'
            {
             before(grammarAccess.getSoftwareAccess().getRutaDestinoKeyword_9_1()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Software__Group_9__1__Impl4562); 
             after(grammarAccess.getSoftwareAccess().getRutaDestinoKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_9__1__Impl"


    // $ANTLR start "rule__Software__Group_9__2"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2347:1: rule__Software__Group_9__2 : rule__Software__Group_9__2__Impl ;
    public final void rule__Software__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2351:1: ( rule__Software__Group_9__2__Impl )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2352:2: rule__Software__Group_9__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Software__Group_9__2__Impl_in_rule__Software__Group_9__24593);
            rule__Software__Group_9__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_9__2"


    // $ANTLR start "rule__Software__Group_9__2__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2358:1: rule__Software__Group_9__2__Impl : ( ( rule__Software__RutaDestinoAssignment_9_2 ) ) ;
    public final void rule__Software__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2362:1: ( ( ( rule__Software__RutaDestinoAssignment_9_2 ) ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2363:1: ( ( rule__Software__RutaDestinoAssignment_9_2 ) )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2363:1: ( ( rule__Software__RutaDestinoAssignment_9_2 ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2364:1: ( rule__Software__RutaDestinoAssignment_9_2 )
            {
             before(grammarAccess.getSoftwareAccess().getRutaDestinoAssignment_9_2()); 
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2365:1: ( rule__Software__RutaDestinoAssignment_9_2 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2365:2: rule__Software__RutaDestinoAssignment_9_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Software__RutaDestinoAssignment_9_2_in_rule__Software__Group_9__2__Impl4620);
            rule__Software__RutaDestinoAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getSoftwareAccess().getRutaDestinoAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_9__2__Impl"


    // $ANTLR start "rule__Software__Group_10__0"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2381:1: rule__Software__Group_10__0 : rule__Software__Group_10__0__Impl rule__Software__Group_10__1 ;
    public final void rule__Software__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2385:1: ( rule__Software__Group_10__0__Impl rule__Software__Group_10__1 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2386:2: rule__Software__Group_10__0__Impl rule__Software__Group_10__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Software__Group_10__0__Impl_in_rule__Software__Group_10__04656);
            rule__Software__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Software__Group_10__1_in_rule__Software__Group_10__04659);
            rule__Software__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_10__0"


    // $ANTLR start "rule__Software__Group_10__0__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2393:1: rule__Software__Group_10__0__Impl : ( ',' ) ;
    public final void rule__Software__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2397:1: ( ( ',' ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2398:1: ( ',' )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2398:1: ( ',' )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2399:1: ','
            {
             before(grammarAccess.getSoftwareAccess().getCommaKeyword_10_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Software__Group_10__0__Impl4687); 
             after(grammarAccess.getSoftwareAccess().getCommaKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_10__0__Impl"


    // $ANTLR start "rule__Software__Group_10__1"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2412:1: rule__Software__Group_10__1 : rule__Software__Group_10__1__Impl rule__Software__Group_10__2 ;
    public final void rule__Software__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2416:1: ( rule__Software__Group_10__1__Impl rule__Software__Group_10__2 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2417:2: rule__Software__Group_10__1__Impl rule__Software__Group_10__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Software__Group_10__1__Impl_in_rule__Software__Group_10__14718);
            rule__Software__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Software__Group_10__2_in_rule__Software__Group_10__14721);
            rule__Software__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_10__1"


    // $ANTLR start "rule__Software__Group_10__1__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2424:1: rule__Software__Group_10__1__Impl : ( 'dependencia:' ) ;
    public final void rule__Software__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2428:1: ( ( 'dependencia:' ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2429:1: ( 'dependencia:' )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2429:1: ( 'dependencia:' )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2430:1: 'dependencia:'
            {
             before(grammarAccess.getSoftwareAccess().getDependenciaKeyword_10_1()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Software__Group_10__1__Impl4749); 
             after(grammarAccess.getSoftwareAccess().getDependenciaKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_10__1__Impl"


    // $ANTLR start "rule__Software__Group_10__2"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2443:1: rule__Software__Group_10__2 : rule__Software__Group_10__2__Impl rule__Software__Group_10__3 ;
    public final void rule__Software__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2447:1: ( rule__Software__Group_10__2__Impl rule__Software__Group_10__3 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2448:2: rule__Software__Group_10__2__Impl rule__Software__Group_10__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Software__Group_10__2__Impl_in_rule__Software__Group_10__24780);
            rule__Software__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Software__Group_10__3_in_rule__Software__Group_10__24783);
            rule__Software__Group_10__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_10__2"


    // $ANTLR start "rule__Software__Group_10__2__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2455:1: rule__Software__Group_10__2__Impl : ( '(' ) ;
    public final void rule__Software__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2459:1: ( ( '(' ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2460:1: ( '(' )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2460:1: ( '(' )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2461:1: '('
            {
             before(grammarAccess.getSoftwareAccess().getLeftParenthesisKeyword_10_2()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Software__Group_10__2__Impl4811); 
             after(grammarAccess.getSoftwareAccess().getLeftParenthesisKeyword_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_10__2__Impl"


    // $ANTLR start "rule__Software__Group_10__3"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2474:1: rule__Software__Group_10__3 : rule__Software__Group_10__3__Impl rule__Software__Group_10__4 ;
    public final void rule__Software__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2478:1: ( rule__Software__Group_10__3__Impl rule__Software__Group_10__4 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2479:2: rule__Software__Group_10__3__Impl rule__Software__Group_10__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Software__Group_10__3__Impl_in_rule__Software__Group_10__34842);
            rule__Software__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Software__Group_10__4_in_rule__Software__Group_10__34845);
            rule__Software__Group_10__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_10__3"


    // $ANTLR start "rule__Software__Group_10__3__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2486:1: rule__Software__Group_10__3__Impl : ( ( rule__Software__DependenciaAssignment_10_3 ) ) ;
    public final void rule__Software__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2490:1: ( ( ( rule__Software__DependenciaAssignment_10_3 ) ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2491:1: ( ( rule__Software__DependenciaAssignment_10_3 ) )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2491:1: ( ( rule__Software__DependenciaAssignment_10_3 ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2492:1: ( rule__Software__DependenciaAssignment_10_3 )
            {
             before(grammarAccess.getSoftwareAccess().getDependenciaAssignment_10_3()); 
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2493:1: ( rule__Software__DependenciaAssignment_10_3 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2493:2: rule__Software__DependenciaAssignment_10_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Software__DependenciaAssignment_10_3_in_rule__Software__Group_10__3__Impl4872);
            rule__Software__DependenciaAssignment_10_3();

            state._fsp--;


            }

             after(grammarAccess.getSoftwareAccess().getDependenciaAssignment_10_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_10__3__Impl"


    // $ANTLR start "rule__Software__Group_10__4"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2503:1: rule__Software__Group_10__4 : rule__Software__Group_10__4__Impl rule__Software__Group_10__5 ;
    public final void rule__Software__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2507:1: ( rule__Software__Group_10__4__Impl rule__Software__Group_10__5 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2508:2: rule__Software__Group_10__4__Impl rule__Software__Group_10__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Software__Group_10__4__Impl_in_rule__Software__Group_10__44902);
            rule__Software__Group_10__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Software__Group_10__5_in_rule__Software__Group_10__44905);
            rule__Software__Group_10__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_10__4"


    // $ANTLR start "rule__Software__Group_10__4__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2515:1: rule__Software__Group_10__4__Impl : ( ( rule__Software__Group_10_4__0 )* ) ;
    public final void rule__Software__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2519:1: ( ( ( rule__Software__Group_10_4__0 )* ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2520:1: ( ( rule__Software__Group_10_4__0 )* )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2520:1: ( ( rule__Software__Group_10_4__0 )* )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2521:1: ( rule__Software__Group_10_4__0 )*
            {
             before(grammarAccess.getSoftwareAccess().getGroup_10_4()); 
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2522:1: ( rule__Software__Group_10_4__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==16) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2522:2: rule__Software__Group_10_4__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Software__Group_10_4__0_in_rule__Software__Group_10__4__Impl4932);
            	    rule__Software__Group_10_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getSoftwareAccess().getGroup_10_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_10__4__Impl"


    // $ANTLR start "rule__Software__Group_10__5"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2532:1: rule__Software__Group_10__5 : rule__Software__Group_10__5__Impl ;
    public final void rule__Software__Group_10__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2536:1: ( rule__Software__Group_10__5__Impl )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2537:2: rule__Software__Group_10__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Software__Group_10__5__Impl_in_rule__Software__Group_10__54963);
            rule__Software__Group_10__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_10__5"


    // $ANTLR start "rule__Software__Group_10__5__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2543:1: rule__Software__Group_10__5__Impl : ( ')' ) ;
    public final void rule__Software__Group_10__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2547:1: ( ( ')' ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2548:1: ( ')' )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2548:1: ( ')' )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2549:1: ')'
            {
             before(grammarAccess.getSoftwareAccess().getRightParenthesisKeyword_10_5()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Software__Group_10__5__Impl4991); 
             after(grammarAccess.getSoftwareAccess().getRightParenthesisKeyword_10_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_10__5__Impl"


    // $ANTLR start "rule__Software__Group_10_4__0"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2574:1: rule__Software__Group_10_4__0 : rule__Software__Group_10_4__0__Impl rule__Software__Group_10_4__1 ;
    public final void rule__Software__Group_10_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2578:1: ( rule__Software__Group_10_4__0__Impl rule__Software__Group_10_4__1 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2579:2: rule__Software__Group_10_4__0__Impl rule__Software__Group_10_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Software__Group_10_4__0__Impl_in_rule__Software__Group_10_4__05034);
            rule__Software__Group_10_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Software__Group_10_4__1_in_rule__Software__Group_10_4__05037);
            rule__Software__Group_10_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_10_4__0"


    // $ANTLR start "rule__Software__Group_10_4__0__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2586:1: rule__Software__Group_10_4__0__Impl : ( ',' ) ;
    public final void rule__Software__Group_10_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2590:1: ( ( ',' ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2591:1: ( ',' )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2591:1: ( ',' )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2592:1: ','
            {
             before(grammarAccess.getSoftwareAccess().getCommaKeyword_10_4_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Software__Group_10_4__0__Impl5065); 
             after(grammarAccess.getSoftwareAccess().getCommaKeyword_10_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_10_4__0__Impl"


    // $ANTLR start "rule__Software__Group_10_4__1"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2605:1: rule__Software__Group_10_4__1 : rule__Software__Group_10_4__1__Impl ;
    public final void rule__Software__Group_10_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2609:1: ( rule__Software__Group_10_4__1__Impl )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2610:2: rule__Software__Group_10_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Software__Group_10_4__1__Impl_in_rule__Software__Group_10_4__15096);
            rule__Software__Group_10_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_10_4__1"


    // $ANTLR start "rule__Software__Group_10_4__1__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2616:1: rule__Software__Group_10_4__1__Impl : ( ( rule__Software__DependenciaAssignment_10_4_1 ) ) ;
    public final void rule__Software__Group_10_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2620:1: ( ( ( rule__Software__DependenciaAssignment_10_4_1 ) ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2621:1: ( ( rule__Software__DependenciaAssignment_10_4_1 ) )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2621:1: ( ( rule__Software__DependenciaAssignment_10_4_1 ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2622:1: ( rule__Software__DependenciaAssignment_10_4_1 )
            {
             before(grammarAccess.getSoftwareAccess().getDependenciaAssignment_10_4_1()); 
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2623:1: ( rule__Software__DependenciaAssignment_10_4_1 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2623:2: rule__Software__DependenciaAssignment_10_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Software__DependenciaAssignment_10_4_1_in_rule__Software__Group_10_4__1__Impl5123);
            rule__Software__DependenciaAssignment_10_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSoftwareAccess().getDependenciaAssignment_10_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_10_4__1__Impl"


    // $ANTLR start "rule__Software__Group_11__0"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2637:1: rule__Software__Group_11__0 : rule__Software__Group_11__0__Impl rule__Software__Group_11__1 ;
    public final void rule__Software__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2641:1: ( rule__Software__Group_11__0__Impl rule__Software__Group_11__1 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2642:2: rule__Software__Group_11__0__Impl rule__Software__Group_11__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Software__Group_11__0__Impl_in_rule__Software__Group_11__05157);
            rule__Software__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Software__Group_11__1_in_rule__Software__Group_11__05160);
            rule__Software__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_11__0"


    // $ANTLR start "rule__Software__Group_11__0__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2649:1: rule__Software__Group_11__0__Impl : ( ',' ) ;
    public final void rule__Software__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2653:1: ( ( ',' ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2654:1: ( ',' )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2654:1: ( ',' )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2655:1: ','
            {
             before(grammarAccess.getSoftwareAccess().getCommaKeyword_11_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Software__Group_11__0__Impl5188); 
             after(grammarAccess.getSoftwareAccess().getCommaKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_11__0__Impl"


    // $ANTLR start "rule__Software__Group_11__1"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2668:1: rule__Software__Group_11__1 : rule__Software__Group_11__1__Impl rule__Software__Group_11__2 ;
    public final void rule__Software__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2672:1: ( rule__Software__Group_11__1__Impl rule__Software__Group_11__2 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2673:2: rule__Software__Group_11__1__Impl rule__Software__Group_11__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Software__Group_11__1__Impl_in_rule__Software__Group_11__15219);
            rule__Software__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Software__Group_11__2_in_rule__Software__Group_11__15222);
            rule__Software__Group_11__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_11__1"


    // $ANTLR start "rule__Software__Group_11__1__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2680:1: rule__Software__Group_11__1__Impl : ( 'origen:' ) ;
    public final void rule__Software__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2684:1: ( ( 'origen:' ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2685:1: ( 'origen:' )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2685:1: ( 'origen:' )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2686:1: 'origen:'
            {
             before(grammarAccess.getSoftwareAccess().getOrigenKeyword_11_1()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__Software__Group_11__1__Impl5250); 
             after(grammarAccess.getSoftwareAccess().getOrigenKeyword_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_11__1__Impl"


    // $ANTLR start "rule__Software__Group_11__2"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2699:1: rule__Software__Group_11__2 : rule__Software__Group_11__2__Impl rule__Software__Group_11__3 ;
    public final void rule__Software__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2703:1: ( rule__Software__Group_11__2__Impl rule__Software__Group_11__3 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2704:2: rule__Software__Group_11__2__Impl rule__Software__Group_11__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Software__Group_11__2__Impl_in_rule__Software__Group_11__25281);
            rule__Software__Group_11__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Software__Group_11__3_in_rule__Software__Group_11__25284);
            rule__Software__Group_11__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_11__2"


    // $ANTLR start "rule__Software__Group_11__2__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2711:1: rule__Software__Group_11__2__Impl : ( '(' ) ;
    public final void rule__Software__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2715:1: ( ( '(' ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2716:1: ( '(' )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2716:1: ( '(' )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2717:1: '('
            {
             before(grammarAccess.getSoftwareAccess().getLeftParenthesisKeyword_11_2()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Software__Group_11__2__Impl5312); 
             after(grammarAccess.getSoftwareAccess().getLeftParenthesisKeyword_11_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_11__2__Impl"


    // $ANTLR start "rule__Software__Group_11__3"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2730:1: rule__Software__Group_11__3 : rule__Software__Group_11__3__Impl rule__Software__Group_11__4 ;
    public final void rule__Software__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2734:1: ( rule__Software__Group_11__3__Impl rule__Software__Group_11__4 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2735:2: rule__Software__Group_11__3__Impl rule__Software__Group_11__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Software__Group_11__3__Impl_in_rule__Software__Group_11__35343);
            rule__Software__Group_11__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Software__Group_11__4_in_rule__Software__Group_11__35346);
            rule__Software__Group_11__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_11__3"


    // $ANTLR start "rule__Software__Group_11__3__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2742:1: rule__Software__Group_11__3__Impl : ( ( rule__Software__OrigenAssignment_11_3 ) ) ;
    public final void rule__Software__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2746:1: ( ( ( rule__Software__OrigenAssignment_11_3 ) ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2747:1: ( ( rule__Software__OrigenAssignment_11_3 ) )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2747:1: ( ( rule__Software__OrigenAssignment_11_3 ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2748:1: ( rule__Software__OrigenAssignment_11_3 )
            {
             before(grammarAccess.getSoftwareAccess().getOrigenAssignment_11_3()); 
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2749:1: ( rule__Software__OrigenAssignment_11_3 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2749:2: rule__Software__OrigenAssignment_11_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Software__OrigenAssignment_11_3_in_rule__Software__Group_11__3__Impl5373);
            rule__Software__OrigenAssignment_11_3();

            state._fsp--;


            }

             after(grammarAccess.getSoftwareAccess().getOrigenAssignment_11_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_11__3__Impl"


    // $ANTLR start "rule__Software__Group_11__4"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2759:1: rule__Software__Group_11__4 : rule__Software__Group_11__4__Impl rule__Software__Group_11__5 ;
    public final void rule__Software__Group_11__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2763:1: ( rule__Software__Group_11__4__Impl rule__Software__Group_11__5 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2764:2: rule__Software__Group_11__4__Impl rule__Software__Group_11__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Software__Group_11__4__Impl_in_rule__Software__Group_11__45403);
            rule__Software__Group_11__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Software__Group_11__5_in_rule__Software__Group_11__45406);
            rule__Software__Group_11__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_11__4"


    // $ANTLR start "rule__Software__Group_11__4__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2771:1: rule__Software__Group_11__4__Impl : ( ( rule__Software__Group_11_4__0 )* ) ;
    public final void rule__Software__Group_11__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2775:1: ( ( ( rule__Software__Group_11_4__0 )* ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2776:1: ( ( rule__Software__Group_11_4__0 )* )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2776:1: ( ( rule__Software__Group_11_4__0 )* )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2777:1: ( rule__Software__Group_11_4__0 )*
            {
             before(grammarAccess.getSoftwareAccess().getGroup_11_4()); 
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2778:1: ( rule__Software__Group_11_4__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==16) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2778:2: rule__Software__Group_11_4__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Software__Group_11_4__0_in_rule__Software__Group_11__4__Impl5433);
            	    rule__Software__Group_11_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getSoftwareAccess().getGroup_11_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_11__4__Impl"


    // $ANTLR start "rule__Software__Group_11__5"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2788:1: rule__Software__Group_11__5 : rule__Software__Group_11__5__Impl ;
    public final void rule__Software__Group_11__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2792:1: ( rule__Software__Group_11__5__Impl )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2793:2: rule__Software__Group_11__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Software__Group_11__5__Impl_in_rule__Software__Group_11__55464);
            rule__Software__Group_11__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_11__5"


    // $ANTLR start "rule__Software__Group_11__5__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2799:1: rule__Software__Group_11__5__Impl : ( ')' ) ;
    public final void rule__Software__Group_11__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2803:1: ( ( ')' ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2804:1: ( ')' )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2804:1: ( ')' )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2805:1: ')'
            {
             before(grammarAccess.getSoftwareAccess().getRightParenthesisKeyword_11_5()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Software__Group_11__5__Impl5492); 
             after(grammarAccess.getSoftwareAccess().getRightParenthesisKeyword_11_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_11__5__Impl"


    // $ANTLR start "rule__Software__Group_11_4__0"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2830:1: rule__Software__Group_11_4__0 : rule__Software__Group_11_4__0__Impl rule__Software__Group_11_4__1 ;
    public final void rule__Software__Group_11_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2834:1: ( rule__Software__Group_11_4__0__Impl rule__Software__Group_11_4__1 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2835:2: rule__Software__Group_11_4__0__Impl rule__Software__Group_11_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Software__Group_11_4__0__Impl_in_rule__Software__Group_11_4__05535);
            rule__Software__Group_11_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Software__Group_11_4__1_in_rule__Software__Group_11_4__05538);
            rule__Software__Group_11_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_11_4__0"


    // $ANTLR start "rule__Software__Group_11_4__0__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2842:1: rule__Software__Group_11_4__0__Impl : ( ',' ) ;
    public final void rule__Software__Group_11_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2846:1: ( ( ',' ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2847:1: ( ',' )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2847:1: ( ',' )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2848:1: ','
            {
             before(grammarAccess.getSoftwareAccess().getCommaKeyword_11_4_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Software__Group_11_4__0__Impl5566); 
             after(grammarAccess.getSoftwareAccess().getCommaKeyword_11_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_11_4__0__Impl"


    // $ANTLR start "rule__Software__Group_11_4__1"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2861:1: rule__Software__Group_11_4__1 : rule__Software__Group_11_4__1__Impl ;
    public final void rule__Software__Group_11_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2865:1: ( rule__Software__Group_11_4__1__Impl )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2866:2: rule__Software__Group_11_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Software__Group_11_4__1__Impl_in_rule__Software__Group_11_4__15597);
            rule__Software__Group_11_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_11_4__1"


    // $ANTLR start "rule__Software__Group_11_4__1__Impl"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2872:1: rule__Software__Group_11_4__1__Impl : ( ( rule__Software__OrigenAssignment_11_4_1 ) ) ;
    public final void rule__Software__Group_11_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2876:1: ( ( ( rule__Software__OrigenAssignment_11_4_1 ) ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2877:1: ( ( rule__Software__OrigenAssignment_11_4_1 ) )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2877:1: ( ( rule__Software__OrigenAssignment_11_4_1 ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2878:1: ( rule__Software__OrigenAssignment_11_4_1 )
            {
             before(grammarAccess.getSoftwareAccess().getOrigenAssignment_11_4_1()); 
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2879:1: ( rule__Software__OrigenAssignment_11_4_1 )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2879:2: rule__Software__OrigenAssignment_11_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Software__OrigenAssignment_11_4_1_in_rule__Software__Group_11_4__1__Impl5624);
            rule__Software__OrigenAssignment_11_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSoftwareAccess().getOrigenAssignment_11_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_11_4__1__Impl"


    // $ANTLR start "rule__Configuracion__SistemaOperativoAssignment_3_0"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2894:1: rule__Configuracion__SistemaOperativoAssignment_3_0 : ( ruleSistemaOperativo ) ;
    public final void rule__Configuracion__SistemaOperativoAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2898:1: ( ( ruleSistemaOperativo ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2899:1: ( ruleSistemaOperativo )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2899:1: ( ruleSistemaOperativo )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2900:1: ruleSistemaOperativo
            {
             before(grammarAccess.getConfiguracionAccess().getSistemaOperativoSistemaOperativoParserRuleCall_3_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSistemaOperativo_in_rule__Configuracion__SistemaOperativoAssignment_3_05663);
            ruleSistemaOperativo();

            state._fsp--;

             after(grammarAccess.getConfiguracionAccess().getSistemaOperativoSistemaOperativoParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuracion__SistemaOperativoAssignment_3_0"


    // $ANTLR start "rule__Configuracion__SistemaOperativoAssignment_3_1_1"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2909:1: rule__Configuracion__SistemaOperativoAssignment_3_1_1 : ( ruleSistemaOperativo ) ;
    public final void rule__Configuracion__SistemaOperativoAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2913:1: ( ( ruleSistemaOperativo ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2914:1: ( ruleSistemaOperativo )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2914:1: ( ruleSistemaOperativo )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2915:1: ruleSistemaOperativo
            {
             before(grammarAccess.getConfiguracionAccess().getSistemaOperativoSistemaOperativoParserRuleCall_3_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSistemaOperativo_in_rule__Configuracion__SistemaOperativoAssignment_3_1_15694);
            ruleSistemaOperativo();

            state._fsp--;

             after(grammarAccess.getConfiguracionAccess().getSistemaOperativoSistemaOperativoParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuracion__SistemaOperativoAssignment_3_1_1"


    // $ANTLR start "rule__SistemaOperativo__NameAssignment_1"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2924:1: rule__SistemaOperativo__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__SistemaOperativo__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2928:1: ( ( ruleEString ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2929:1: ( ruleEString )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2929:1: ( ruleEString )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2930:1: ruleEString
            {
             before(grammarAccess.getSistemaOperativoAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__SistemaOperativo__NameAssignment_15725);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSistemaOperativoAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SistemaOperativo__NameAssignment_1"


    // $ANTLR start "rule__SistemaOperativo__VersionAssignment_4"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2939:1: rule__SistemaOperativo__VersionAssignment_4 : ( ruleEString ) ;
    public final void rule__SistemaOperativo__VersionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2943:1: ( ( ruleEString ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2944:1: ( ruleEString )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2944:1: ( ruleEString )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2945:1: ruleEString
            {
             before(grammarAccess.getSistemaOperativoAccess().getVersionEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__SistemaOperativo__VersionAssignment_45756);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSistemaOperativoAccess().getVersionEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SistemaOperativo__VersionAssignment_4"


    // $ANTLR start "rule__SistemaOperativo__DescripcionAssignment_6"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2954:1: rule__SistemaOperativo__DescripcionAssignment_6 : ( ruleEString ) ;
    public final void rule__SistemaOperativo__DescripcionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2958:1: ( ( ruleEString ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2959:1: ( ruleEString )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2959:1: ( ruleEString )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2960:1: ruleEString
            {
             before(grammarAccess.getSistemaOperativoAccess().getDescripcionEStringParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__SistemaOperativo__DescripcionAssignment_65787);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSistemaOperativoAccess().getDescripcionEStringParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SistemaOperativo__DescripcionAssignment_6"


    // $ANTLR start "rule__SistemaOperativo__ArquitecturaAssignment_8"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2969:1: rule__SistemaOperativo__ArquitecturaAssignment_8 : ( ruleArquitectura ) ;
    public final void rule__SistemaOperativo__ArquitecturaAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2973:1: ( ( ruleArquitectura ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2974:1: ( ruleArquitectura )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2974:1: ( ruleArquitectura )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2975:1: ruleArquitectura
            {
             before(grammarAccess.getSistemaOperativoAccess().getArquitecturaArquitecturaEnumRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleArquitectura_in_rule__SistemaOperativo__ArquitecturaAssignment_85818);
            ruleArquitectura();

            state._fsp--;

             after(grammarAccess.getSistemaOperativoAccess().getArquitecturaArquitecturaEnumRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SistemaOperativo__ArquitecturaAssignment_8"


    // $ANTLR start "rule__SistemaOperativo__FuentesAssignment_9_2"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2984:1: rule__SistemaOperativo__FuentesAssignment_9_2 : ( ruleFuentes ) ;
    public final void rule__SistemaOperativo__FuentesAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2988:1: ( ( ruleFuentes ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2989:1: ( ruleFuentes )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2989:1: ( ruleFuentes )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2990:1: ruleFuentes
            {
             before(grammarAccess.getSistemaOperativoAccess().getFuentesFuentesParserRuleCall_9_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFuentes_in_rule__SistemaOperativo__FuentesAssignment_9_25849);
            ruleFuentes();

            state._fsp--;

             after(grammarAccess.getSistemaOperativoAccess().getFuentesFuentesParserRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SistemaOperativo__FuentesAssignment_9_2"


    // $ANTLR start "rule__SistemaOperativo__FuentesAssignment_9_3"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:2999:1: rule__SistemaOperativo__FuentesAssignment_9_3 : ( ruleFuentes ) ;
    public final void rule__SistemaOperativo__FuentesAssignment_9_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3003:1: ( ( ruleFuentes ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3004:1: ( ruleFuentes )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3004:1: ( ruleFuentes )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3005:1: ruleFuentes
            {
             before(grammarAccess.getSistemaOperativoAccess().getFuentesFuentesParserRuleCall_9_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFuentes_in_rule__SistemaOperativo__FuentesAssignment_9_35880);
            ruleFuentes();

            state._fsp--;

             after(grammarAccess.getSistemaOperativoAccess().getFuentesFuentesParserRuleCall_9_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SistemaOperativo__FuentesAssignment_9_3"


    // $ANTLR start "rule__SistemaOperativo__RequerimientosAssignment_12"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3014:1: rule__SistemaOperativo__RequerimientosAssignment_12 : ( ruleSoftware ) ;
    public final void rule__SistemaOperativo__RequerimientosAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3018:1: ( ( ruleSoftware ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3019:1: ( ruleSoftware )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3019:1: ( ruleSoftware )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3020:1: ruleSoftware
            {
             before(grammarAccess.getSistemaOperativoAccess().getRequerimientosSoftwareParserRuleCall_12_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSoftware_in_rule__SistemaOperativo__RequerimientosAssignment_125911);
            ruleSoftware();

            state._fsp--;

             after(grammarAccess.getSistemaOperativoAccess().getRequerimientosSoftwareParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SistemaOperativo__RequerimientosAssignment_12"


    // $ANTLR start "rule__SistemaOperativo__RequerimientosAssignment_13"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3029:1: rule__SistemaOperativo__RequerimientosAssignment_13 : ( ruleSoftware ) ;
    public final void rule__SistemaOperativo__RequerimientosAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3033:1: ( ( ruleSoftware ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3034:1: ( ruleSoftware )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3034:1: ( ruleSoftware )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3035:1: ruleSoftware
            {
             before(grammarAccess.getSistemaOperativoAccess().getRequerimientosSoftwareParserRuleCall_13_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSoftware_in_rule__SistemaOperativo__RequerimientosAssignment_135942);
            ruleSoftware();

            state._fsp--;

             after(grammarAccess.getSistemaOperativoAccess().getRequerimientosSoftwareParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SistemaOperativo__RequerimientosAssignment_13"


    // $ANTLR start "rule__Fuentes__NameAssignment_3"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3044:1: rule__Fuentes__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Fuentes__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3048:1: ( ( ruleEString ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3049:1: ( ruleEString )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3049:1: ( ruleEString )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3050:1: ruleEString
            {
             before(grammarAccess.getFuentesAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Fuentes__NameAssignment_35973);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFuentesAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fuentes__NameAssignment_3"


    // $ANTLR start "rule__Fuentes__AutorAssignment_6"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3059:1: rule__Fuentes__AutorAssignment_6 : ( ruleEString ) ;
    public final void rule__Fuentes__AutorAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3063:1: ( ( ruleEString ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3064:1: ( ruleEString )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3064:1: ( ruleEString )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3065:1: ruleEString
            {
             before(grammarAccess.getFuentesAccess().getAutorEStringParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Fuentes__AutorAssignment_66004);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFuentesAccess().getAutorEStringParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fuentes__AutorAssignment_6"


    // $ANTLR start "rule__Fuentes__FuenteAssignment_9"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3074:1: rule__Fuentes__FuenteAssignment_9 : ( ruleEString ) ;
    public final void rule__Fuentes__FuenteAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3078:1: ( ( ruleEString ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3079:1: ( ruleEString )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3079:1: ( ruleEString )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3080:1: ruleEString
            {
             before(grammarAccess.getFuentesAccess().getFuenteEStringParserRuleCall_9_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Fuentes__FuenteAssignment_96035);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFuentesAccess().getFuenteEStringParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fuentes__FuenteAssignment_9"


    // $ANTLR start "rule__Fuentes__TipoFuenteAssignment_12"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3089:1: rule__Fuentes__TipoFuenteAssignment_12 : ( ruleEString ) ;
    public final void rule__Fuentes__TipoFuenteAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3093:1: ( ( ruleEString ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3094:1: ( ruleEString )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3094:1: ( ruleEString )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3095:1: ruleEString
            {
             before(grammarAccess.getFuentesAccess().getTipoFuenteEStringParserRuleCall_12_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Fuentes__TipoFuenteAssignment_126066);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFuentesAccess().getTipoFuenteEStringParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fuentes__TipoFuenteAssignment_12"


    // $ANTLR start "rule__Software__NameAssignment_3"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3104:1: rule__Software__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Software__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3108:1: ( ( ruleEString ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3109:1: ( ruleEString )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3109:1: ( ruleEString )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3110:1: ruleEString
            {
             before(grammarAccess.getSoftwareAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Software__NameAssignment_36097);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSoftwareAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__NameAssignment_3"


    // $ANTLR start "rule__Software__VersionAssignment_4_2"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3119:1: rule__Software__VersionAssignment_4_2 : ( ruleEString ) ;
    public final void rule__Software__VersionAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3123:1: ( ( ruleEString ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3124:1: ( ruleEString )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3124:1: ( ruleEString )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3125:1: ruleEString
            {
             before(grammarAccess.getSoftwareAccess().getVersionEStringParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Software__VersionAssignment_4_26128);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSoftwareAccess().getVersionEStringParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__VersionAssignment_4_2"


    // $ANTLR start "rule__Software__DescripcionAssignment_5_2"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3134:1: rule__Software__DescripcionAssignment_5_2 : ( ruleEString ) ;
    public final void rule__Software__DescripcionAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3138:1: ( ( ruleEString ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3139:1: ( ruleEString )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3139:1: ( ruleEString )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3140:1: ruleEString
            {
             before(grammarAccess.getSoftwareAccess().getDescripcionEStringParserRuleCall_5_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Software__DescripcionAssignment_5_26159);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSoftwareAccess().getDescripcionEStringParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__DescripcionAssignment_5_2"


    // $ANTLR start "rule__Software__ArquitecturaAssignment_8"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3149:1: rule__Software__ArquitecturaAssignment_8 : ( ruleArquitectura ) ;
    public final void rule__Software__ArquitecturaAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3153:1: ( ( ruleArquitectura ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3154:1: ( ruleArquitectura )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3154:1: ( ruleArquitectura )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3155:1: ruleArquitectura
            {
             before(grammarAccess.getSoftwareAccess().getArquitecturaArquitecturaEnumRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleArquitectura_in_rule__Software__ArquitecturaAssignment_86190);
            ruleArquitectura();

            state._fsp--;

             after(grammarAccess.getSoftwareAccess().getArquitecturaArquitecturaEnumRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__ArquitecturaAssignment_8"


    // $ANTLR start "rule__Software__RutaDestinoAssignment_9_2"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3164:1: rule__Software__RutaDestinoAssignment_9_2 : ( ruleEString ) ;
    public final void rule__Software__RutaDestinoAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3168:1: ( ( ruleEString ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3169:1: ( ruleEString )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3169:1: ( ruleEString )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3170:1: ruleEString
            {
             before(grammarAccess.getSoftwareAccess().getRutaDestinoEStringParserRuleCall_9_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Software__RutaDestinoAssignment_9_26221);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSoftwareAccess().getRutaDestinoEStringParserRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__RutaDestinoAssignment_9_2"


    // $ANTLR start "rule__Software__DependenciaAssignment_10_3"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3179:1: rule__Software__DependenciaAssignment_10_3 : ( ( ruleEString ) ) ;
    public final void rule__Software__DependenciaAssignment_10_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3183:1: ( ( ( ruleEString ) ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3184:1: ( ( ruleEString ) )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3184:1: ( ( ruleEString ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3185:1: ( ruleEString )
            {
             before(grammarAccess.getSoftwareAccess().getDependenciaSoftwareCrossReference_10_3_0()); 
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3186:1: ( ruleEString )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3187:1: ruleEString
            {
             before(grammarAccess.getSoftwareAccess().getDependenciaSoftwareEStringParserRuleCall_10_3_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Software__DependenciaAssignment_10_36256);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSoftwareAccess().getDependenciaSoftwareEStringParserRuleCall_10_3_0_1()); 

            }

             after(grammarAccess.getSoftwareAccess().getDependenciaSoftwareCrossReference_10_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__DependenciaAssignment_10_3"


    // $ANTLR start "rule__Software__DependenciaAssignment_10_4_1"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3198:1: rule__Software__DependenciaAssignment_10_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Software__DependenciaAssignment_10_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3202:1: ( ( ( ruleEString ) ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3203:1: ( ( ruleEString ) )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3203:1: ( ( ruleEString ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3204:1: ( ruleEString )
            {
             before(grammarAccess.getSoftwareAccess().getDependenciaSoftwareCrossReference_10_4_1_0()); 
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3205:1: ( ruleEString )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3206:1: ruleEString
            {
             before(grammarAccess.getSoftwareAccess().getDependenciaSoftwareEStringParserRuleCall_10_4_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Software__DependenciaAssignment_10_4_16295);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSoftwareAccess().getDependenciaSoftwareEStringParserRuleCall_10_4_1_0_1()); 

            }

             after(grammarAccess.getSoftwareAccess().getDependenciaSoftwareCrossReference_10_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__DependenciaAssignment_10_4_1"


    // $ANTLR start "rule__Software__OrigenAssignment_11_3"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3217:1: rule__Software__OrigenAssignment_11_3 : ( ( ruleEString ) ) ;
    public final void rule__Software__OrigenAssignment_11_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3221:1: ( ( ( ruleEString ) ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3222:1: ( ( ruleEString ) )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3222:1: ( ( ruleEString ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3223:1: ( ruleEString )
            {
             before(grammarAccess.getSoftwareAccess().getOrigenFuentesCrossReference_11_3_0()); 
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3224:1: ( ruleEString )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3225:1: ruleEString
            {
             before(grammarAccess.getSoftwareAccess().getOrigenFuentesEStringParserRuleCall_11_3_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Software__OrigenAssignment_11_36334);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSoftwareAccess().getOrigenFuentesEStringParserRuleCall_11_3_0_1()); 

            }

             after(grammarAccess.getSoftwareAccess().getOrigenFuentesCrossReference_11_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__OrigenAssignment_11_3"


    // $ANTLR start "rule__Software__OrigenAssignment_11_4_1"
    // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3236:1: rule__Software__OrigenAssignment_11_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Software__OrigenAssignment_11_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3240:1: ( ( ( ruleEString ) ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3241:1: ( ( ruleEString ) )
            {
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3241:1: ( ( ruleEString ) )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3242:1: ( ruleEString )
            {
             before(grammarAccess.getSoftwareAccess().getOrigenFuentesCrossReference_11_4_1_0()); 
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3243:1: ( ruleEString )
            // ../co.edu.uniandes.mono.gesco.ui/src-gen/co/edu/uniandes/mono/gesco/ui/contentassist/antlr/internal/InternalDSL.g:3244:1: ruleEString
            {
             before(grammarAccess.getSoftwareAccess().getOrigenFuentesEStringParserRuleCall_11_4_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Software__OrigenAssignment_11_4_16373);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSoftwareAccess().getOrigenFuentesEStringParserRuleCall_11_4_1_0_1()); 

            }

             after(grammarAccess.getSoftwareAccess().getOrigenFuentesCrossReference_11_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__OrigenAssignment_11_4_1"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleConfiguracion_in_entryRuleConfiguracion61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConfiguracion68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configuracion__Group__0_in_ruleConfiguracion94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSistemaOperativo_in_entryRuleSistemaOperativo121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSistemaOperativo128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SistemaOperativo__Group__0_in_ruleSistemaOperativo154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFuentes_in_entryRuleFuentes241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFuentes248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fuentes__Group__0_in_ruleFuentes274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSoftware_in_entryRuleSoftware301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSoftware308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Software__Group__0_in_ruleSoftware334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Arquitectura__Alternatives_in_ruleArquitectura371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Arquitectura__Alternatives456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Arquitectura__Alternatives477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configuracion__Group__0__Impl_in_rule__Configuracion__Group__0510 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Configuracion__Group__1_in_rule__Configuracion__Group__0513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configuracion__Group__1__Impl_in_rule__Configuracion__Group__1571 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Configuracion__Group__2_in_rule__Configuracion__Group__1574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Configuracion__Group__1__Impl602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configuracion__Group__2__Impl_in_rule__Configuracion__Group__2633 = new BitSet(new long[]{0x0000000000008030L});
        public static final BitSet FOLLOW_rule__Configuracion__Group__3_in_rule__Configuracion__Group__2636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Configuracion__Group__2__Impl664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configuracion__Group__3__Impl_in_rule__Configuracion__Group__3695 = new BitSet(new long[]{0x0000000000008030L});
        public static final BitSet FOLLOW_rule__Configuracion__Group__4_in_rule__Configuracion__Group__3698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configuracion__Group_3__0_in_rule__Configuracion__Group__3__Impl725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configuracion__Group__4__Impl_in_rule__Configuracion__Group__4756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Configuracion__Group__4__Impl784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configuracion__Group_3__0__Impl_in_rule__Configuracion__Group_3__0825 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Configuracion__Group_3__1_in_rule__Configuracion__Group_3__0828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configuracion__SistemaOperativoAssignment_3_0_in_rule__Configuracion__Group_3__0__Impl855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configuracion__Group_3__1__Impl_in_rule__Configuracion__Group_3__1885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configuracion__Group_3_1__0_in_rule__Configuracion__Group_3__1__Impl912 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__Configuracion__Group_3_1__0__Impl_in_rule__Configuracion__Group_3_1__0947 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Configuracion__Group_3_1__1_in_rule__Configuracion__Group_3_1__0950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Configuracion__Group_3_1__0__Impl978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configuracion__Group_3_1__1__Impl_in_rule__Configuracion__Group_3_1__11009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Configuracion__SistemaOperativoAssignment_3_1_1_in_rule__Configuracion__Group_3_1__1__Impl1036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SistemaOperativo__Group__0__Impl_in_rule__SistemaOperativo__Group__01070 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__SistemaOperativo__Group__1_in_rule__SistemaOperativo__Group__01073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SistemaOperativo__Group__1__Impl_in_rule__SistemaOperativo__Group__11131 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__SistemaOperativo__Group__2_in_rule__SistemaOperativo__Group__11134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SistemaOperativo__NameAssignment_1_in_rule__SistemaOperativo__Group__1__Impl1161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SistemaOperativo__Group__2__Impl_in_rule__SistemaOperativo__Group__21191 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__SistemaOperativo__Group__3_in_rule__SistemaOperativo__Group__21194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__SistemaOperativo__Group__2__Impl1222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SistemaOperativo__Group__3__Impl_in_rule__SistemaOperativo__Group__31253 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__SistemaOperativo__Group__4_in_rule__SistemaOperativo__Group__31256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__SistemaOperativo__Group__3__Impl1284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SistemaOperativo__Group__4__Impl_in_rule__SistemaOperativo__Group__41315 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__SistemaOperativo__Group__5_in_rule__SistemaOperativo__Group__41318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SistemaOperativo__VersionAssignment_4_in_rule__SistemaOperativo__Group__4__Impl1345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SistemaOperativo__Group__5__Impl_in_rule__SistemaOperativo__Group__51375 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__SistemaOperativo__Group__6_in_rule__SistemaOperativo__Group__51378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__SistemaOperativo__Group__5__Impl1406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SistemaOperativo__Group__6__Impl_in_rule__SistemaOperativo__Group__61437 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__SistemaOperativo__Group__7_in_rule__SistemaOperativo__Group__61440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SistemaOperativo__DescripcionAssignment_6_in_rule__SistemaOperativo__Group__6__Impl1467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SistemaOperativo__Group__7__Impl_in_rule__SistemaOperativo__Group__71497 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__SistemaOperativo__Group__8_in_rule__SistemaOperativo__Group__71500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__SistemaOperativo__Group__7__Impl1528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SistemaOperativo__Group__8__Impl_in_rule__SistemaOperativo__Group__81559 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_rule__SistemaOperativo__Group__9_in_rule__SistemaOperativo__Group__81562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SistemaOperativo__ArquitecturaAssignment_8_in_rule__SistemaOperativo__Group__8__Impl1589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SistemaOperativo__Group__9__Impl_in_rule__SistemaOperativo__Group__91619 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_rule__SistemaOperativo__Group__10_in_rule__SistemaOperativo__Group__91622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SistemaOperativo__Group_9__0_in_rule__SistemaOperativo__Group__9__Impl1649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SistemaOperativo__Group__10__Impl_in_rule__SistemaOperativo__Group__101680 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__SistemaOperativo__Group__11_in_rule__SistemaOperativo__Group__101683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__SistemaOperativo__Group__10__Impl1711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SistemaOperativo__Group__11__Impl_in_rule__SistemaOperativo__Group__111742 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__SistemaOperativo__Group__12_in_rule__SistemaOperativo__Group__111745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__SistemaOperativo__Group__11__Impl1773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SistemaOperativo__Group__12__Impl_in_rule__SistemaOperativo__Group__121804 = new BitSet(new long[]{0x0000000010008000L});
        public static final BitSet FOLLOW_rule__SistemaOperativo__Group__13_in_rule__SistemaOperativo__Group__121807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SistemaOperativo__RequerimientosAssignment_12_in_rule__SistemaOperativo__Group__12__Impl1834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SistemaOperativo__Group__13__Impl_in_rule__SistemaOperativo__Group__131864 = new BitSet(new long[]{0x0000000010008000L});
        public static final BitSet FOLLOW_rule__SistemaOperativo__Group__14_in_rule__SistemaOperativo__Group__131867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SistemaOperativo__RequerimientosAssignment_13_in_rule__SistemaOperativo__Group__13__Impl1894 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_rule__SistemaOperativo__Group__14__Impl_in_rule__SistemaOperativo__Group__141925 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__SistemaOperativo__Group__15_in_rule__SistemaOperativo__Group__141928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__SistemaOperativo__Group__14__Impl1956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SistemaOperativo__Group__15__Impl_in_rule__SistemaOperativo__Group__151987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__SistemaOperativo__Group__15__Impl2015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SistemaOperativo__Group_9__0__Impl_in_rule__SistemaOperativo__Group_9__02078 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__SistemaOperativo__Group_9__1_in_rule__SistemaOperativo__Group_9__02081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__SistemaOperativo__Group_9__0__Impl2109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SistemaOperativo__Group_9__1__Impl_in_rule__SistemaOperativo__Group_9__12140 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__SistemaOperativo__Group_9__2_in_rule__SistemaOperativo__Group_9__12143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__SistemaOperativo__Group_9__1__Impl2171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SistemaOperativo__Group_9__2__Impl_in_rule__SistemaOperativo__Group_9__22202 = new BitSet(new long[]{0x0000000000408000L});
        public static final BitSet FOLLOW_rule__SistemaOperativo__Group_9__3_in_rule__SistemaOperativo__Group_9__22205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SistemaOperativo__FuentesAssignment_9_2_in_rule__SistemaOperativo__Group_9__2__Impl2232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SistemaOperativo__Group_9__3__Impl_in_rule__SistemaOperativo__Group_9__32262 = new BitSet(new long[]{0x0000000000408000L});
        public static final BitSet FOLLOW_rule__SistemaOperativo__Group_9__4_in_rule__SistemaOperativo__Group_9__32265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SistemaOperativo__FuentesAssignment_9_3_in_rule__SistemaOperativo__Group_9__3__Impl2292 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_rule__SistemaOperativo__Group_9__4__Impl_in_rule__SistemaOperativo__Group_9__42323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__SistemaOperativo__Group_9__4__Impl2351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fuentes__Group__0__Impl_in_rule__Fuentes__Group__02392 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Fuentes__Group__1_in_rule__Fuentes__Group__02395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fuentes__Group__1__Impl_in_rule__Fuentes__Group__12453 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Fuentes__Group__2_in_rule__Fuentes__Group__12456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Fuentes__Group__1__Impl2484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fuentes__Group__2__Impl_in_rule__Fuentes__Group__22515 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Fuentes__Group__3_in_rule__Fuentes__Group__22518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Fuentes__Group__2__Impl2546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fuentes__Group__3__Impl_in_rule__Fuentes__Group__32577 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Fuentes__Group__4_in_rule__Fuentes__Group__32580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fuentes__NameAssignment_3_in_rule__Fuentes__Group__3__Impl2607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fuentes__Group__4__Impl_in_rule__Fuentes__Group__42637 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Fuentes__Group__5_in_rule__Fuentes__Group__42640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Fuentes__Group__4__Impl2668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fuentes__Group__5__Impl_in_rule__Fuentes__Group__52699 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Fuentes__Group__6_in_rule__Fuentes__Group__52702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Fuentes__Group__5__Impl2730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fuentes__Group__6__Impl_in_rule__Fuentes__Group__62761 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Fuentes__Group__7_in_rule__Fuentes__Group__62764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fuentes__AutorAssignment_6_in_rule__Fuentes__Group__6__Impl2791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fuentes__Group__7__Impl_in_rule__Fuentes__Group__72821 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Fuentes__Group__8_in_rule__Fuentes__Group__72824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Fuentes__Group__7__Impl2852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fuentes__Group__8__Impl_in_rule__Fuentes__Group__82883 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Fuentes__Group__9_in_rule__Fuentes__Group__82886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Fuentes__Group__8__Impl2914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fuentes__Group__9__Impl_in_rule__Fuentes__Group__92945 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Fuentes__Group__10_in_rule__Fuentes__Group__92948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fuentes__FuenteAssignment_9_in_rule__Fuentes__Group__9__Impl2975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fuentes__Group__10__Impl_in_rule__Fuentes__Group__103005 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Fuentes__Group__11_in_rule__Fuentes__Group__103008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Fuentes__Group__10__Impl3036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fuentes__Group__11__Impl_in_rule__Fuentes__Group__113067 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Fuentes__Group__12_in_rule__Fuentes__Group__113070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Fuentes__Group__11__Impl3098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fuentes__Group__12__Impl_in_rule__Fuentes__Group__123129 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Fuentes__Group__13_in_rule__Fuentes__Group__123132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fuentes__TipoFuenteAssignment_12_in_rule__Fuentes__Group__12__Impl3159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Fuentes__Group__13__Impl_in_rule__Fuentes__Group__133189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Fuentes__Group__13__Impl3217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Software__Group__0__Impl_in_rule__Software__Group__03276 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Software__Group__1_in_rule__Software__Group__03279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Software__Group__1__Impl_in_rule__Software__Group__13337 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Software__Group__2_in_rule__Software__Group__13340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Software__Group__1__Impl3368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Software__Group__2__Impl_in_rule__Software__Group__23399 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Software__Group__3_in_rule__Software__Group__23402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Software__Group__2__Impl3430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Software__Group__3__Impl_in_rule__Software__Group__33461 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Software__Group__4_in_rule__Software__Group__33464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Software__NameAssignment_3_in_rule__Software__Group__3__Impl3491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Software__Group__4__Impl_in_rule__Software__Group__43521 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Software__Group__5_in_rule__Software__Group__43524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Software__Group_4__0_in_rule__Software__Group__4__Impl3551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Software__Group__5__Impl_in_rule__Software__Group__53582 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Software__Group__6_in_rule__Software__Group__53585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Software__Group_5__0_in_rule__Software__Group__5__Impl3612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Software__Group__6__Impl_in_rule__Software__Group__63643 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Software__Group__7_in_rule__Software__Group__63646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Software__Group__6__Impl3674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Software__Group__7__Impl_in_rule__Software__Group__73705 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__Software__Group__8_in_rule__Software__Group__73708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Software__Group__7__Impl3736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Software__Group__8__Impl_in_rule__Software__Group__83767 = new BitSet(new long[]{0x0000000008010000L});
        public static final BitSet FOLLOW_rule__Software__Group__9_in_rule__Software__Group__83770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Software__ArquitecturaAssignment_8_in_rule__Software__Group__8__Impl3797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Software__Group__9__Impl_in_rule__Software__Group__93827 = new BitSet(new long[]{0x0000000008010000L});
        public static final BitSet FOLLOW_rule__Software__Group__10_in_rule__Software__Group__93830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Software__Group_9__0_in_rule__Software__Group__9__Impl3857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Software__Group__10__Impl_in_rule__Software__Group__103888 = new BitSet(new long[]{0x0000000008010000L});
        public static final BitSet FOLLOW_rule__Software__Group__11_in_rule__Software__Group__103891 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Software__Group_10__0_in_rule__Software__Group__10__Impl3918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Software__Group__11__Impl_in_rule__Software__Group__113949 = new BitSet(new long[]{0x0000000008010000L});
        public static final BitSet FOLLOW_rule__Software__Group__12_in_rule__Software__Group__113952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Software__Group_11__0_in_rule__Software__Group__11__Impl3979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Software__Group__12__Impl_in_rule__Software__Group__124010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Software__Group__12__Impl4038 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Software__Group_4__0__Impl_in_rule__Software__Group_4__04095 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__Software__Group_4__1_in_rule__Software__Group_4__04098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Software__Group_4__0__Impl4126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Software__Group_4__1__Impl_in_rule__Software__Group_4__14157 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Software__Group_4__2_in_rule__Software__Group_4__14160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Software__Group_4__1__Impl4188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Software__Group_4__2__Impl_in_rule__Software__Group_4__24219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Software__VersionAssignment_4_2_in_rule__Software__Group_4__2__Impl4246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Software__Group_5__0__Impl_in_rule__Software__Group_5__04282 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__Software__Group_5__1_in_rule__Software__Group_5__04285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Software__Group_5__0__Impl4313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Software__Group_5__1__Impl_in_rule__Software__Group_5__14344 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Software__Group_5__2_in_rule__Software__Group_5__14347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Software__Group_5__1__Impl4375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Software__Group_5__2__Impl_in_rule__Software__Group_5__24406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Software__DescripcionAssignment_5_2_in_rule__Software__Group_5__2__Impl4433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Software__Group_9__0__Impl_in_rule__Software__Group_9__04469 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__Software__Group_9__1_in_rule__Software__Group_9__04472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Software__Group_9__0__Impl4500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Software__Group_9__1__Impl_in_rule__Software__Group_9__14531 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Software__Group_9__2_in_rule__Software__Group_9__14534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Software__Group_9__1__Impl4562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Software__Group_9__2__Impl_in_rule__Software__Group_9__24593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Software__RutaDestinoAssignment_9_2_in_rule__Software__Group_9__2__Impl4620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Software__Group_10__0__Impl_in_rule__Software__Group_10__04656 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__Software__Group_10__1_in_rule__Software__Group_10__04659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Software__Group_10__0__Impl4687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Software__Group_10__1__Impl_in_rule__Software__Group_10__14718 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__Software__Group_10__2_in_rule__Software__Group_10__14721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Software__Group_10__1__Impl4749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Software__Group_10__2__Impl_in_rule__Software__Group_10__24780 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Software__Group_10__3_in_rule__Software__Group_10__24783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Software__Group_10__2__Impl4811 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Software__Group_10__3__Impl_in_rule__Software__Group_10__34842 = new BitSet(new long[]{0x0000000800010000L});
        public static final BitSet FOLLOW_rule__Software__Group_10__4_in_rule__Software__Group_10__34845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Software__DependenciaAssignment_10_3_in_rule__Software__Group_10__3__Impl4872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Software__Group_10__4__Impl_in_rule__Software__Group_10__44902 = new BitSet(new long[]{0x0000000800010000L});
        public static final BitSet FOLLOW_rule__Software__Group_10__5_in_rule__Software__Group_10__44905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Software__Group_10_4__0_in_rule__Software__Group_10__4__Impl4932 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__Software__Group_10__5__Impl_in_rule__Software__Group_10__54963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Software__Group_10__5__Impl4991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Software__Group_10_4__0__Impl_in_rule__Software__Group_10_4__05034 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Software__Group_10_4__1_in_rule__Software__Group_10_4__05037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Software__Group_10_4__0__Impl5065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Software__Group_10_4__1__Impl_in_rule__Software__Group_10_4__15096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Software__DependenciaAssignment_10_4_1_in_rule__Software__Group_10_4__1__Impl5123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Software__Group_11__0__Impl_in_rule__Software__Group_11__05157 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__Software__Group_11__1_in_rule__Software__Group_11__05160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Software__Group_11__0__Impl5188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Software__Group_11__1__Impl_in_rule__Software__Group_11__15219 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__Software__Group_11__2_in_rule__Software__Group_11__15222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__Software__Group_11__1__Impl5250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Software__Group_11__2__Impl_in_rule__Software__Group_11__25281 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Software__Group_11__3_in_rule__Software__Group_11__25284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Software__Group_11__2__Impl5312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Software__Group_11__3__Impl_in_rule__Software__Group_11__35343 = new BitSet(new long[]{0x0000000800010000L});
        public static final BitSet FOLLOW_rule__Software__Group_11__4_in_rule__Software__Group_11__35346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Software__OrigenAssignment_11_3_in_rule__Software__Group_11__3__Impl5373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Software__Group_11__4__Impl_in_rule__Software__Group_11__45403 = new BitSet(new long[]{0x0000000800010000L});
        public static final BitSet FOLLOW_rule__Software__Group_11__5_in_rule__Software__Group_11__45406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Software__Group_11_4__0_in_rule__Software__Group_11__4__Impl5433 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__Software__Group_11__5__Impl_in_rule__Software__Group_11__55464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Software__Group_11__5__Impl5492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Software__Group_11_4__0__Impl_in_rule__Software__Group_11_4__05535 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Software__Group_11_4__1_in_rule__Software__Group_11_4__05538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Software__Group_11_4__0__Impl5566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Software__Group_11_4__1__Impl_in_rule__Software__Group_11_4__15597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Software__OrigenAssignment_11_4_1_in_rule__Software__Group_11_4__1__Impl5624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSistemaOperativo_in_rule__Configuracion__SistemaOperativoAssignment_3_05663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSistemaOperativo_in_rule__Configuracion__SistemaOperativoAssignment_3_1_15694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__SistemaOperativo__NameAssignment_15725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__SistemaOperativo__VersionAssignment_45756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__SistemaOperativo__DescripcionAssignment_65787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArquitectura_in_rule__SistemaOperativo__ArquitecturaAssignment_85818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFuentes_in_rule__SistemaOperativo__FuentesAssignment_9_25849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFuentes_in_rule__SistemaOperativo__FuentesAssignment_9_35880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSoftware_in_rule__SistemaOperativo__RequerimientosAssignment_125911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSoftware_in_rule__SistemaOperativo__RequerimientosAssignment_135942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Fuentes__NameAssignment_35973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Fuentes__AutorAssignment_66004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Fuentes__FuenteAssignment_96035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Fuentes__TipoFuenteAssignment_126066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Software__NameAssignment_36097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Software__VersionAssignment_4_26128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Software__DescripcionAssignment_5_26159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArquitectura_in_rule__Software__ArquitecturaAssignment_86190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Software__RutaDestinoAssignment_9_26221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Software__DependenciaAssignment_10_36256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Software__DependenciaAssignment_10_4_16295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Software__OrigenAssignment_11_36334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Software__OrigenAssignment_11_4_16373 = new BitSet(new long[]{0x0000000000000002L});
    }


}