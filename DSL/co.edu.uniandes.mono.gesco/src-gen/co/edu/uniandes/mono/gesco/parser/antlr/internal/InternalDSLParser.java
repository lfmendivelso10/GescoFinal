package co.edu.uniandes.mono.gesco.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import co.edu.uniandes.mono.gesco.services.DSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Configuracion'", "'{'", "','", "'}'", "'version'", "'descripcion'", "'arquitectura'", "'fuentes'", "'requerimientos'", "'Fuente'", "'='", "'autor:'", "'fuente:'", "'tipoFuente:'", "';'", "'Software'", "'version:'", "'descripcion:'", "'arquitectura:'", "'rutaDestino:'", "'dependencia:'", "'('", "')'", "'origen:'", "'x64'", "'x32'"
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
    public String getGrammarFileName() { return "../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g"; }



     	private DSLGrammarAccess grammarAccess;
     	
        public InternalDSLParser(TokenStream input, DSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Configuracion";	
       	}
       	
       	@Override
       	protected DSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleConfiguracion"
    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:68:1: entryRuleConfiguracion returns [EObject current=null] : iv_ruleConfiguracion= ruleConfiguracion EOF ;
    public final EObject entryRuleConfiguracion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfiguracion = null;


        try {
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:69:2: (iv_ruleConfiguracion= ruleConfiguracion EOF )
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:70:2: iv_ruleConfiguracion= ruleConfiguracion EOF
            {
             newCompositeNode(grammarAccess.getConfiguracionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConfiguracion_in_entryRuleConfiguracion75);
            iv_ruleConfiguracion=ruleConfiguracion();

            state._fsp--;

             current =iv_ruleConfiguracion; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConfiguracion85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConfiguracion"


    // $ANTLR start "ruleConfiguracion"
    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:77:1: ruleConfiguracion returns [EObject current=null] : ( () otherlv_1= 'Configuracion' otherlv_2= '{' ( ( (lv_sistemaOperativo_3_0= ruleSistemaOperativo ) ) (otherlv_4= ',' ( (lv_sistemaOperativo_5_0= ruleSistemaOperativo ) ) )* )? otherlv_6= '}' ) ;
    public final EObject ruleConfiguracion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_sistemaOperativo_3_0 = null;

        EObject lv_sistemaOperativo_5_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:80:28: ( ( () otherlv_1= 'Configuracion' otherlv_2= '{' ( ( (lv_sistemaOperativo_3_0= ruleSistemaOperativo ) ) (otherlv_4= ',' ( (lv_sistemaOperativo_5_0= ruleSistemaOperativo ) ) )* )? otherlv_6= '}' ) )
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:81:1: ( () otherlv_1= 'Configuracion' otherlv_2= '{' ( ( (lv_sistemaOperativo_3_0= ruleSistemaOperativo ) ) (otherlv_4= ',' ( (lv_sistemaOperativo_5_0= ruleSistemaOperativo ) ) )* )? otherlv_6= '}' )
            {
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:81:1: ( () otherlv_1= 'Configuracion' otherlv_2= '{' ( ( (lv_sistemaOperativo_3_0= ruleSistemaOperativo ) ) (otherlv_4= ',' ( (lv_sistemaOperativo_5_0= ruleSistemaOperativo ) ) )* )? otherlv_6= '}' )
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:81:2: () otherlv_1= 'Configuracion' otherlv_2= '{' ( ( (lv_sistemaOperativo_3_0= ruleSistemaOperativo ) ) (otherlv_4= ',' ( (lv_sistemaOperativo_5_0= ruleSistemaOperativo ) ) )* )? otherlv_6= '}'
            {
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:81:2: ()
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getConfiguracionAccess().getConfiguracionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleConfiguracion131); 

                	newLeafNode(otherlv_1, grammarAccess.getConfiguracionAccess().getConfiguracionKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleConfiguracion143); 

                	newLeafNode(otherlv_2, grammarAccess.getConfiguracionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:95:1: ( ( (lv_sistemaOperativo_3_0= ruleSistemaOperativo ) ) (otherlv_4= ',' ( (lv_sistemaOperativo_5_0= ruleSistemaOperativo ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_ID)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:95:2: ( (lv_sistemaOperativo_3_0= ruleSistemaOperativo ) ) (otherlv_4= ',' ( (lv_sistemaOperativo_5_0= ruleSistemaOperativo ) ) )*
                    {
                    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:95:2: ( (lv_sistemaOperativo_3_0= ruleSistemaOperativo ) )
                    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:96:1: (lv_sistemaOperativo_3_0= ruleSistemaOperativo )
                    {
                    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:96:1: (lv_sistemaOperativo_3_0= ruleSistemaOperativo )
                    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:97:3: lv_sistemaOperativo_3_0= ruleSistemaOperativo
                    {
                     
                    	        newCompositeNode(grammarAccess.getConfiguracionAccess().getSistemaOperativoSistemaOperativoParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSistemaOperativo_in_ruleConfiguracion165);
                    lv_sistemaOperativo_3_0=ruleSistemaOperativo();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConfiguracionRule());
                    	        }
                           		add(
                           			current, 
                           			"sistemaOperativo",
                            		lv_sistemaOperativo_3_0, 
                            		"SistemaOperativo");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:113:2: (otherlv_4= ',' ( (lv_sistemaOperativo_5_0= ruleSistemaOperativo ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==13) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:113:4: otherlv_4= ',' ( (lv_sistemaOperativo_5_0= ruleSistemaOperativo ) )
                    	    {
                    	    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleConfiguracion178); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getConfiguracionAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:117:1: ( (lv_sistemaOperativo_5_0= ruleSistemaOperativo ) )
                    	    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:118:1: (lv_sistemaOperativo_5_0= ruleSistemaOperativo )
                    	    {
                    	    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:118:1: (lv_sistemaOperativo_5_0= ruleSistemaOperativo )
                    	    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:119:3: lv_sistemaOperativo_5_0= ruleSistemaOperativo
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConfiguracionAccess().getSistemaOperativoSistemaOperativoParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSistemaOperativo_in_ruleConfiguracion199);
                    	    lv_sistemaOperativo_5_0=ruleSistemaOperativo();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getConfiguracionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"sistemaOperativo",
                    	            		lv_sistemaOperativo_5_0, 
                    	            		"SistemaOperativo");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleConfiguracion215); 

                	newLeafNode(otherlv_6, grammarAccess.getConfiguracionAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConfiguracion"


    // $ANTLR start "entryRuleSistemaOperativo"
    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:147:1: entryRuleSistemaOperativo returns [EObject current=null] : iv_ruleSistemaOperativo= ruleSistemaOperativo EOF ;
    public final EObject entryRuleSistemaOperativo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSistemaOperativo = null;


        try {
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:148:2: (iv_ruleSistemaOperativo= ruleSistemaOperativo EOF )
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:149:2: iv_ruleSistemaOperativo= ruleSistemaOperativo EOF
            {
             newCompositeNode(grammarAccess.getSistemaOperativoRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSistemaOperativo_in_entryRuleSistemaOperativo251);
            iv_ruleSistemaOperativo=ruleSistemaOperativo();

            state._fsp--;

             current =iv_ruleSistemaOperativo; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSistemaOperativo261); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSistemaOperativo"


    // $ANTLR start "ruleSistemaOperativo"
    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:156:1: ruleSistemaOperativo returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'version' ( (lv_version_4_0= ruleEString ) ) otherlv_5= 'descripcion' ( (lv_descripcion_6_0= ruleEString ) ) otherlv_7= 'arquitectura' ( (lv_arquitectura_8_0= ruleArquitectura ) ) (otherlv_9= 'fuentes' otherlv_10= '{' ( (lv_fuentes_11_0= ruleFuentes ) ) ( (lv_fuentes_12_0= ruleFuentes ) )* otherlv_13= '}' )? otherlv_14= 'requerimientos' otherlv_15= '{' ( (lv_requerimientos_16_0= ruleSoftware ) ) ( (lv_requerimientos_17_0= ruleSoftware ) )* otherlv_18= '}' otherlv_19= '}' ) ;
    public final EObject ruleSistemaOperativo() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_version_4_0 = null;

        AntlrDatatypeRuleToken lv_descripcion_6_0 = null;

        Enumerator lv_arquitectura_8_0 = null;

        EObject lv_fuentes_11_0 = null;

        EObject lv_fuentes_12_0 = null;

        EObject lv_requerimientos_16_0 = null;

        EObject lv_requerimientos_17_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:159:28: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'version' ( (lv_version_4_0= ruleEString ) ) otherlv_5= 'descripcion' ( (lv_descripcion_6_0= ruleEString ) ) otherlv_7= 'arquitectura' ( (lv_arquitectura_8_0= ruleArquitectura ) ) (otherlv_9= 'fuentes' otherlv_10= '{' ( (lv_fuentes_11_0= ruleFuentes ) ) ( (lv_fuentes_12_0= ruleFuentes ) )* otherlv_13= '}' )? otherlv_14= 'requerimientos' otherlv_15= '{' ( (lv_requerimientos_16_0= ruleSoftware ) ) ( (lv_requerimientos_17_0= ruleSoftware ) )* otherlv_18= '}' otherlv_19= '}' ) )
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:160:1: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'version' ( (lv_version_4_0= ruleEString ) ) otherlv_5= 'descripcion' ( (lv_descripcion_6_0= ruleEString ) ) otherlv_7= 'arquitectura' ( (lv_arquitectura_8_0= ruleArquitectura ) ) (otherlv_9= 'fuentes' otherlv_10= '{' ( (lv_fuentes_11_0= ruleFuentes ) ) ( (lv_fuentes_12_0= ruleFuentes ) )* otherlv_13= '}' )? otherlv_14= 'requerimientos' otherlv_15= '{' ( (lv_requerimientos_16_0= ruleSoftware ) ) ( (lv_requerimientos_17_0= ruleSoftware ) )* otherlv_18= '}' otherlv_19= '}' )
            {
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:160:1: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'version' ( (lv_version_4_0= ruleEString ) ) otherlv_5= 'descripcion' ( (lv_descripcion_6_0= ruleEString ) ) otherlv_7= 'arquitectura' ( (lv_arquitectura_8_0= ruleArquitectura ) ) (otherlv_9= 'fuentes' otherlv_10= '{' ( (lv_fuentes_11_0= ruleFuentes ) ) ( (lv_fuentes_12_0= ruleFuentes ) )* otherlv_13= '}' )? otherlv_14= 'requerimientos' otherlv_15= '{' ( (lv_requerimientos_16_0= ruleSoftware ) ) ( (lv_requerimientos_17_0= ruleSoftware ) )* otherlv_18= '}' otherlv_19= '}' )
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:160:2: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'version' ( (lv_version_4_0= ruleEString ) ) otherlv_5= 'descripcion' ( (lv_descripcion_6_0= ruleEString ) ) otherlv_7= 'arquitectura' ( (lv_arquitectura_8_0= ruleArquitectura ) ) (otherlv_9= 'fuentes' otherlv_10= '{' ( (lv_fuentes_11_0= ruleFuentes ) ) ( (lv_fuentes_12_0= ruleFuentes ) )* otherlv_13= '}' )? otherlv_14= 'requerimientos' otherlv_15= '{' ( (lv_requerimientos_16_0= ruleSoftware ) ) ( (lv_requerimientos_17_0= ruleSoftware ) )* otherlv_18= '}' otherlv_19= '}'
            {
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:160:2: ()
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:161:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSistemaOperativoAccess().getSistemaOperativoAction_0(),
                        current);
                

            }

            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:166:2: ( (lv_name_1_0= ruleEString ) )
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:167:1: (lv_name_1_0= ruleEString )
            {
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:167:1: (lv_name_1_0= ruleEString )
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:168:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSistemaOperativoAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSistemaOperativo316);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSistemaOperativoRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSistemaOperativo328); 

                	newLeafNode(otherlv_2, grammarAccess.getSistemaOperativoAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSistemaOperativo340); 

                	newLeafNode(otherlv_3, grammarAccess.getSistemaOperativoAccess().getVersionKeyword_3());
                
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:192:1: ( (lv_version_4_0= ruleEString ) )
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:193:1: (lv_version_4_0= ruleEString )
            {
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:193:1: (lv_version_4_0= ruleEString )
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:194:3: lv_version_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSistemaOperativoAccess().getVersionEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSistemaOperativo361);
            lv_version_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSistemaOperativoRule());
            	        }
                   		set(
                   			current, 
                   			"version",
                    		lv_version_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSistemaOperativo373); 

                	newLeafNode(otherlv_5, grammarAccess.getSistemaOperativoAccess().getDescripcionKeyword_5());
                
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:214:1: ( (lv_descripcion_6_0= ruleEString ) )
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:215:1: (lv_descripcion_6_0= ruleEString )
            {
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:215:1: (lv_descripcion_6_0= ruleEString )
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:216:3: lv_descripcion_6_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSistemaOperativoAccess().getDescripcionEStringParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSistemaOperativo394);
            lv_descripcion_6_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSistemaOperativoRule());
            	        }
                   		set(
                   			current, 
                   			"descripcion",
                    		lv_descripcion_6_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSistemaOperativo406); 

                	newLeafNode(otherlv_7, grammarAccess.getSistemaOperativoAccess().getArquitecturaKeyword_7());
                
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:236:1: ( (lv_arquitectura_8_0= ruleArquitectura ) )
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:237:1: (lv_arquitectura_8_0= ruleArquitectura )
            {
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:237:1: (lv_arquitectura_8_0= ruleArquitectura )
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:238:3: lv_arquitectura_8_0= ruleArquitectura
            {
             
            	        newCompositeNode(grammarAccess.getSistemaOperativoAccess().getArquitecturaArquitecturaEnumRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleArquitectura_in_ruleSistemaOperativo427);
            lv_arquitectura_8_0=ruleArquitectura();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSistemaOperativoRule());
            	        }
                   		set(
                   			current, 
                   			"arquitectura",
                    		lv_arquitectura_8_0, 
                    		"Arquitectura");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:254:2: (otherlv_9= 'fuentes' otherlv_10= '{' ( (lv_fuentes_11_0= ruleFuentes ) ) ( (lv_fuentes_12_0= ruleFuentes ) )* otherlv_13= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:254:4: otherlv_9= 'fuentes' otherlv_10= '{' ( (lv_fuentes_11_0= ruleFuentes ) ) ( (lv_fuentes_12_0= ruleFuentes ) )* otherlv_13= '}'
                    {
                    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSistemaOperativo440); 

                        	newLeafNode(otherlv_9, grammarAccess.getSistemaOperativoAccess().getFuentesKeyword_9_0());
                        
                    otherlv_10=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSistemaOperativo452); 

                        	newLeafNode(otherlv_10, grammarAccess.getSistemaOperativoAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:262:1: ( (lv_fuentes_11_0= ruleFuentes ) )
                    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:263:1: (lv_fuentes_11_0= ruleFuentes )
                    {
                    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:263:1: (lv_fuentes_11_0= ruleFuentes )
                    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:264:3: lv_fuentes_11_0= ruleFuentes
                    {
                     
                    	        newCompositeNode(grammarAccess.getSistemaOperativoAccess().getFuentesFuentesParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleFuentes_in_ruleSistemaOperativo473);
                    lv_fuentes_11_0=ruleFuentes();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSistemaOperativoRule());
                    	        }
                           		add(
                           			current, 
                           			"fuentes",
                            		lv_fuentes_11_0, 
                            		"Fuentes");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:280:2: ( (lv_fuentes_12_0= ruleFuentes ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==20) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:281:1: (lv_fuentes_12_0= ruleFuentes )
                    	    {
                    	    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:281:1: (lv_fuentes_12_0= ruleFuentes )
                    	    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:282:3: lv_fuentes_12_0= ruleFuentes
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSistemaOperativoAccess().getFuentesFuentesParserRuleCall_9_3_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleFuentes_in_ruleSistemaOperativo494);
                    	    lv_fuentes_12_0=ruleFuentes();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSistemaOperativoRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"fuentes",
                    	            		lv_fuentes_12_0, 
                    	            		"Fuentes");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSistemaOperativo507); 

                        	newLeafNode(otherlv_13, grammarAccess.getSistemaOperativoAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            otherlv_14=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSistemaOperativo521); 

                	newLeafNode(otherlv_14, grammarAccess.getSistemaOperativoAccess().getRequerimientosKeyword_10());
                
            otherlv_15=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSistemaOperativo533); 

                	newLeafNode(otherlv_15, grammarAccess.getSistemaOperativoAccess().getLeftCurlyBracketKeyword_11());
                
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:310:1: ( (lv_requerimientos_16_0= ruleSoftware ) )
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:311:1: (lv_requerimientos_16_0= ruleSoftware )
            {
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:311:1: (lv_requerimientos_16_0= ruleSoftware )
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:312:3: lv_requerimientos_16_0= ruleSoftware
            {
             
            	        newCompositeNode(grammarAccess.getSistemaOperativoAccess().getRequerimientosSoftwareParserRuleCall_12_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleSoftware_in_ruleSistemaOperativo554);
            lv_requerimientos_16_0=ruleSoftware();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSistemaOperativoRule());
            	        }
                   		add(
                   			current, 
                   			"requerimientos",
                    		lv_requerimientos_16_0, 
                    		"Software");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:328:2: ( (lv_requerimientos_17_0= ruleSoftware ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==26) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:329:1: (lv_requerimientos_17_0= ruleSoftware )
            	    {
            	    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:329:1: (lv_requerimientos_17_0= ruleSoftware )
            	    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:330:3: lv_requerimientos_17_0= ruleSoftware
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSistemaOperativoAccess().getRequerimientosSoftwareParserRuleCall_13_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleSoftware_in_ruleSistemaOperativo575);
            	    lv_requerimientos_17_0=ruleSoftware();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSistemaOperativoRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"requerimientos",
            	            		lv_requerimientos_17_0, 
            	            		"Software");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_18=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSistemaOperativo588); 

                	newLeafNode(otherlv_18, grammarAccess.getSistemaOperativoAccess().getRightCurlyBracketKeyword_14());
                
            otherlv_19=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSistemaOperativo600); 

                	newLeafNode(otherlv_19, grammarAccess.getSistemaOperativoAccess().getRightCurlyBracketKeyword_15());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSistemaOperativo"


    // $ANTLR start "entryRuleEString"
    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:362:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:363:2: (iv_ruleEString= ruleEString EOF )
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:364:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString637);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString648); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:371:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:374:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:375:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:375:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:375:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString688); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:383:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString714); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleFuentes"
    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:398:1: entryRuleFuentes returns [EObject current=null] : iv_ruleFuentes= ruleFuentes EOF ;
    public final EObject entryRuleFuentes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuentes = null;


        try {
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:399:2: (iv_ruleFuentes= ruleFuentes EOF )
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:400:2: iv_ruleFuentes= ruleFuentes EOF
            {
             newCompositeNode(grammarAccess.getFuentesRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFuentes_in_entryRuleFuentes759);
            iv_ruleFuentes=ruleFuentes();

            state._fsp--;

             current =iv_ruleFuentes; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFuentes769); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFuentes"


    // $ANTLR start "ruleFuentes"
    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:407:1: ruleFuentes returns [EObject current=null] : ( () otherlv_1= 'Fuente' otherlv_2= '=' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ',' otherlv_5= 'autor:' ( (lv_autor_6_0= ruleEString ) ) otherlv_7= ',' otherlv_8= 'fuente:' ( (lv_fuente_9_0= ruleEString ) ) otherlv_10= ',' otherlv_11= 'tipoFuente:' ( (lv_tipoFuente_12_0= ruleEString ) ) otherlv_13= ';' ) ;
    public final EObject ruleFuentes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_autor_6_0 = null;

        AntlrDatatypeRuleToken lv_fuente_9_0 = null;

        AntlrDatatypeRuleToken lv_tipoFuente_12_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:410:28: ( ( () otherlv_1= 'Fuente' otherlv_2= '=' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ',' otherlv_5= 'autor:' ( (lv_autor_6_0= ruleEString ) ) otherlv_7= ',' otherlv_8= 'fuente:' ( (lv_fuente_9_0= ruleEString ) ) otherlv_10= ',' otherlv_11= 'tipoFuente:' ( (lv_tipoFuente_12_0= ruleEString ) ) otherlv_13= ';' ) )
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:411:1: ( () otherlv_1= 'Fuente' otherlv_2= '=' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ',' otherlv_5= 'autor:' ( (lv_autor_6_0= ruleEString ) ) otherlv_7= ',' otherlv_8= 'fuente:' ( (lv_fuente_9_0= ruleEString ) ) otherlv_10= ',' otherlv_11= 'tipoFuente:' ( (lv_tipoFuente_12_0= ruleEString ) ) otherlv_13= ';' )
            {
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:411:1: ( () otherlv_1= 'Fuente' otherlv_2= '=' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ',' otherlv_5= 'autor:' ( (lv_autor_6_0= ruleEString ) ) otherlv_7= ',' otherlv_8= 'fuente:' ( (lv_fuente_9_0= ruleEString ) ) otherlv_10= ',' otherlv_11= 'tipoFuente:' ( (lv_tipoFuente_12_0= ruleEString ) ) otherlv_13= ';' )
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:411:2: () otherlv_1= 'Fuente' otherlv_2= '=' ( (lv_name_3_0= ruleEString ) ) otherlv_4= ',' otherlv_5= 'autor:' ( (lv_autor_6_0= ruleEString ) ) otherlv_7= ',' otherlv_8= 'fuente:' ( (lv_fuente_9_0= ruleEString ) ) otherlv_10= ',' otherlv_11= 'tipoFuente:' ( (lv_tipoFuente_12_0= ruleEString ) ) otherlv_13= ';'
            {
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:411:2: ()
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:412:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFuentesAccess().getFuentesAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleFuentes815); 

                	newLeafNode(otherlv_1, grammarAccess.getFuentesAccess().getFuenteKeyword_1());
                
            otherlv_2=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleFuentes827); 

                	newLeafNode(otherlv_2, grammarAccess.getFuentesAccess().getEqualsSignKeyword_2());
                
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:425:1: ( (lv_name_3_0= ruleEString ) )
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:426:1: (lv_name_3_0= ruleEString )
            {
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:426:1: (lv_name_3_0= ruleEString )
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:427:3: lv_name_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFuentesAccess().getNameEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFuentes848);
            lv_name_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFuentesRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleFuentes860); 

                	newLeafNode(otherlv_4, grammarAccess.getFuentesAccess().getCommaKeyword_4());
                
            otherlv_5=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleFuentes872); 

                	newLeafNode(otherlv_5, grammarAccess.getFuentesAccess().getAutorKeyword_5());
                
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:451:1: ( (lv_autor_6_0= ruleEString ) )
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:452:1: (lv_autor_6_0= ruleEString )
            {
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:452:1: (lv_autor_6_0= ruleEString )
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:453:3: lv_autor_6_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFuentesAccess().getAutorEStringParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFuentes893);
            lv_autor_6_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFuentesRule());
            	        }
                   		set(
                   			current, 
                   			"autor",
                    		lv_autor_6_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleFuentes905); 

                	newLeafNode(otherlv_7, grammarAccess.getFuentesAccess().getCommaKeyword_7());
                
            otherlv_8=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleFuentes917); 

                	newLeafNode(otherlv_8, grammarAccess.getFuentesAccess().getFuenteKeyword_8());
                
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:477:1: ( (lv_fuente_9_0= ruleEString ) )
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:478:1: (lv_fuente_9_0= ruleEString )
            {
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:478:1: (lv_fuente_9_0= ruleEString )
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:479:3: lv_fuente_9_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFuentesAccess().getFuenteEStringParserRuleCall_9_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFuentes938);
            lv_fuente_9_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFuentesRule());
            	        }
                   		set(
                   			current, 
                   			"fuente",
                    		lv_fuente_9_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleFuentes950); 

                	newLeafNode(otherlv_10, grammarAccess.getFuentesAccess().getCommaKeyword_10());
                
            otherlv_11=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleFuentes962); 

                	newLeafNode(otherlv_11, grammarAccess.getFuentesAccess().getTipoFuenteKeyword_11());
                
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:503:1: ( (lv_tipoFuente_12_0= ruleEString ) )
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:504:1: (lv_tipoFuente_12_0= ruleEString )
            {
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:504:1: (lv_tipoFuente_12_0= ruleEString )
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:505:3: lv_tipoFuente_12_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFuentesAccess().getTipoFuenteEStringParserRuleCall_12_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFuentes983);
            lv_tipoFuente_12_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFuentesRule());
            	        }
                   		set(
                   			current, 
                   			"tipoFuente",
                    		lv_tipoFuente_12_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_13=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleFuentes995); 

                	newLeafNode(otherlv_13, grammarAccess.getFuentesAccess().getSemicolonKeyword_13());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFuentes"


    // $ANTLR start "entryRuleSoftware"
    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:533:1: entryRuleSoftware returns [EObject current=null] : iv_ruleSoftware= ruleSoftware EOF ;
    public final EObject entryRuleSoftware() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSoftware = null;


        try {
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:534:2: (iv_ruleSoftware= ruleSoftware EOF )
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:535:2: iv_ruleSoftware= ruleSoftware EOF
            {
             newCompositeNode(grammarAccess.getSoftwareRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSoftware_in_entryRuleSoftware1031);
            iv_ruleSoftware=ruleSoftware();

            state._fsp--;

             current =iv_ruleSoftware; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSoftware1041); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSoftware"


    // $ANTLR start "ruleSoftware"
    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:542:1: ruleSoftware returns [EObject current=null] : ( () otherlv_1= 'Software' otherlv_2= '=' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= ',' otherlv_5= 'version:' ( (lv_version_6_0= ruleEString ) ) )? (otherlv_7= ',' otherlv_8= 'descripcion:' ( (lv_descripcion_9_0= ruleEString ) ) )? otherlv_10= ',' otherlv_11= 'arquitectura:' ( (lv_arquitectura_12_0= ruleArquitectura ) ) (otherlv_13= ',' otherlv_14= 'rutaDestino:' ( (lv_rutaDestino_15_0= ruleEString ) ) )? (otherlv_16= ',' otherlv_17= 'dependencia:' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? (otherlv_23= ',' otherlv_24= 'origen:' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')' )? otherlv_30= ';' ) ;
    public final EObject ruleSoftware() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_version_6_0 = null;

        AntlrDatatypeRuleToken lv_descripcion_9_0 = null;

        Enumerator lv_arquitectura_12_0 = null;

        AntlrDatatypeRuleToken lv_rutaDestino_15_0 = null;


         enterRule(); 
            
        try {
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:545:28: ( ( () otherlv_1= 'Software' otherlv_2= '=' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= ',' otherlv_5= 'version:' ( (lv_version_6_0= ruleEString ) ) )? (otherlv_7= ',' otherlv_8= 'descripcion:' ( (lv_descripcion_9_0= ruleEString ) ) )? otherlv_10= ',' otherlv_11= 'arquitectura:' ( (lv_arquitectura_12_0= ruleArquitectura ) ) (otherlv_13= ',' otherlv_14= 'rutaDestino:' ( (lv_rutaDestino_15_0= ruleEString ) ) )? (otherlv_16= ',' otherlv_17= 'dependencia:' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? (otherlv_23= ',' otherlv_24= 'origen:' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')' )? otherlv_30= ';' ) )
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:546:1: ( () otherlv_1= 'Software' otherlv_2= '=' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= ',' otherlv_5= 'version:' ( (lv_version_6_0= ruleEString ) ) )? (otherlv_7= ',' otherlv_8= 'descripcion:' ( (lv_descripcion_9_0= ruleEString ) ) )? otherlv_10= ',' otherlv_11= 'arquitectura:' ( (lv_arquitectura_12_0= ruleArquitectura ) ) (otherlv_13= ',' otherlv_14= 'rutaDestino:' ( (lv_rutaDestino_15_0= ruleEString ) ) )? (otherlv_16= ',' otherlv_17= 'dependencia:' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? (otherlv_23= ',' otherlv_24= 'origen:' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')' )? otherlv_30= ';' )
            {
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:546:1: ( () otherlv_1= 'Software' otherlv_2= '=' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= ',' otherlv_5= 'version:' ( (lv_version_6_0= ruleEString ) ) )? (otherlv_7= ',' otherlv_8= 'descripcion:' ( (lv_descripcion_9_0= ruleEString ) ) )? otherlv_10= ',' otherlv_11= 'arquitectura:' ( (lv_arquitectura_12_0= ruleArquitectura ) ) (otherlv_13= ',' otherlv_14= 'rutaDestino:' ( (lv_rutaDestino_15_0= ruleEString ) ) )? (otherlv_16= ',' otherlv_17= 'dependencia:' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? (otherlv_23= ',' otherlv_24= 'origen:' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')' )? otherlv_30= ';' )
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:546:2: () otherlv_1= 'Software' otherlv_2= '=' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= ',' otherlv_5= 'version:' ( (lv_version_6_0= ruleEString ) ) )? (otherlv_7= ',' otherlv_8= 'descripcion:' ( (lv_descripcion_9_0= ruleEString ) ) )? otherlv_10= ',' otherlv_11= 'arquitectura:' ( (lv_arquitectura_12_0= ruleArquitectura ) ) (otherlv_13= ',' otherlv_14= 'rutaDestino:' ( (lv_rutaDestino_15_0= ruleEString ) ) )? (otherlv_16= ',' otherlv_17= 'dependencia:' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )? (otherlv_23= ',' otherlv_24= 'origen:' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')' )? otherlv_30= ';'
            {
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:546:2: ()
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:547:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSoftwareAccess().getSoftwareAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleSoftware1087); 

                	newLeafNode(otherlv_1, grammarAccess.getSoftwareAccess().getSoftwareKeyword_1());
                
            otherlv_2=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleSoftware1099); 

                	newLeafNode(otherlv_2, grammarAccess.getSoftwareAccess().getEqualsSignKeyword_2());
                
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:560:1: ( (lv_name_3_0= ruleEString ) )
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:561:1: (lv_name_3_0= ruleEString )
            {
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:561:1: (lv_name_3_0= ruleEString )
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:562:3: lv_name_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSoftwareAccess().getNameEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSoftware1120);
            lv_name_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSoftwareRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:578:2: (otherlv_4= ',' otherlv_5= 'version:' ( (lv_version_6_0= ruleEString ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==27) ) {
                    alt7=1;
                }
            }
            switch (alt7) {
                case 1 :
                    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:578:4: otherlv_4= ',' otherlv_5= 'version:' ( (lv_version_6_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSoftware1133); 

                        	newLeafNode(otherlv_4, grammarAccess.getSoftwareAccess().getCommaKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleSoftware1145); 

                        	newLeafNode(otherlv_5, grammarAccess.getSoftwareAccess().getVersionKeyword_4_1());
                        
                    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:586:1: ( (lv_version_6_0= ruleEString ) )
                    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:587:1: (lv_version_6_0= ruleEString )
                    {
                    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:587:1: (lv_version_6_0= ruleEString )
                    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:588:3: lv_version_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getSoftwareAccess().getVersionEStringParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSoftware1166);
                    lv_version_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSoftwareRule());
                    	        }
                           		set(
                           			current, 
                           			"version",
                            		lv_version_6_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:604:4: (otherlv_7= ',' otherlv_8= 'descripcion:' ( (lv_descripcion_9_0= ruleEString ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==28) ) {
                    alt8=1;
                }
            }
            switch (alt8) {
                case 1 :
                    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:604:6: otherlv_7= ',' otherlv_8= 'descripcion:' ( (lv_descripcion_9_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSoftware1181); 

                        	newLeafNode(otherlv_7, grammarAccess.getSoftwareAccess().getCommaKeyword_5_0());
                        
                    otherlv_8=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleSoftware1193); 

                        	newLeafNode(otherlv_8, grammarAccess.getSoftwareAccess().getDescripcionKeyword_5_1());
                        
                    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:612:1: ( (lv_descripcion_9_0= ruleEString ) )
                    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:613:1: (lv_descripcion_9_0= ruleEString )
                    {
                    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:613:1: (lv_descripcion_9_0= ruleEString )
                    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:614:3: lv_descripcion_9_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getSoftwareAccess().getDescripcionEStringParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSoftware1214);
                    lv_descripcion_9_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSoftwareRule());
                    	        }
                           		set(
                           			current, 
                           			"descripcion",
                            		lv_descripcion_9_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSoftware1228); 

                	newLeafNode(otherlv_10, grammarAccess.getSoftwareAccess().getCommaKeyword_6());
                
            otherlv_11=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleSoftware1240); 

                	newLeafNode(otherlv_11, grammarAccess.getSoftwareAccess().getArquitecturaKeyword_7());
                
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:638:1: ( (lv_arquitectura_12_0= ruleArquitectura ) )
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:639:1: (lv_arquitectura_12_0= ruleArquitectura )
            {
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:639:1: (lv_arquitectura_12_0= ruleArquitectura )
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:640:3: lv_arquitectura_12_0= ruleArquitectura
            {
             
            	        newCompositeNode(grammarAccess.getSoftwareAccess().getArquitecturaArquitecturaEnumRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleArquitectura_in_ruleSoftware1261);
            lv_arquitectura_12_0=ruleArquitectura();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSoftwareRule());
            	        }
                   		set(
                   			current, 
                   			"arquitectura",
                    		lv_arquitectura_12_0, 
                    		"Arquitectura");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:656:2: (otherlv_13= ',' otherlv_14= 'rutaDestino:' ( (lv_rutaDestino_15_0= ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==13) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==30) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:656:4: otherlv_13= ',' otherlv_14= 'rutaDestino:' ( (lv_rutaDestino_15_0= ruleEString ) )
                    {
                    otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSoftware1274); 

                        	newLeafNode(otherlv_13, grammarAccess.getSoftwareAccess().getCommaKeyword_9_0());
                        
                    otherlv_14=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleSoftware1286); 

                        	newLeafNode(otherlv_14, grammarAccess.getSoftwareAccess().getRutaDestinoKeyword_9_1());
                        
                    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:664:1: ( (lv_rutaDestino_15_0= ruleEString ) )
                    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:665:1: (lv_rutaDestino_15_0= ruleEString )
                    {
                    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:665:1: (lv_rutaDestino_15_0= ruleEString )
                    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:666:3: lv_rutaDestino_15_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getSoftwareAccess().getRutaDestinoEStringParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSoftware1307);
                    lv_rutaDestino_15_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSoftwareRule());
                    	        }
                           		set(
                           			current, 
                           			"rutaDestino",
                            		lv_rutaDestino_15_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:682:4: (otherlv_16= ',' otherlv_17= 'dependencia:' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==13) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==31) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:682:6: otherlv_16= ',' otherlv_17= 'dependencia:' otherlv_18= '(' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ')'
                    {
                    otherlv_16=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSoftware1322); 

                        	newLeafNode(otherlv_16, grammarAccess.getSoftwareAccess().getCommaKeyword_10_0());
                        
                    otherlv_17=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleSoftware1334); 

                        	newLeafNode(otherlv_17, grammarAccess.getSoftwareAccess().getDependenciaKeyword_10_1());
                        
                    otherlv_18=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleSoftware1346); 

                        	newLeafNode(otherlv_18, grammarAccess.getSoftwareAccess().getLeftParenthesisKeyword_10_2());
                        
                    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:694:1: ( ( ruleEString ) )
                    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:695:1: ( ruleEString )
                    {
                    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:695:1: ( ruleEString )
                    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:696:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSoftwareRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getSoftwareAccess().getDependenciaSoftwareCrossReference_10_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSoftware1369);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:709:2: (otherlv_20= ',' ( ( ruleEString ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==13) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:709:4: otherlv_20= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_20=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSoftware1382); 

                    	        	newLeafNode(otherlv_20, grammarAccess.getSoftwareAccess().getCommaKeyword_10_4_0());
                    	        
                    	    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:713:1: ( ( ruleEString ) )
                    	    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:714:1: ( ruleEString )
                    	    {
                    	    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:714:1: ( ruleEString )
                    	    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:715:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getSoftwareRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getSoftwareAccess().getDependenciaSoftwareCrossReference_10_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSoftware1405);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleSoftware1419); 

                        	newLeafNode(otherlv_22, grammarAccess.getSoftwareAccess().getRightParenthesisKeyword_10_5());
                        

                    }
                    break;

            }

            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:732:3: (otherlv_23= ',' otherlv_24= 'origen:' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==13) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:732:5: otherlv_23= ',' otherlv_24= 'origen:' otherlv_25= '(' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* otherlv_29= ')'
                    {
                    otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSoftware1434); 

                        	newLeafNode(otherlv_23, grammarAccess.getSoftwareAccess().getCommaKeyword_11_0());
                        
                    otherlv_24=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleSoftware1446); 

                        	newLeafNode(otherlv_24, grammarAccess.getSoftwareAccess().getOrigenKeyword_11_1());
                        
                    otherlv_25=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleSoftware1458); 

                        	newLeafNode(otherlv_25, grammarAccess.getSoftwareAccess().getLeftParenthesisKeyword_11_2());
                        
                    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:744:1: ( ( ruleEString ) )
                    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:745:1: ( ruleEString )
                    {
                    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:745:1: ( ruleEString )
                    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:746:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSoftwareRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getSoftwareAccess().getOrigenFuentesCrossReference_11_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSoftware1481);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:759:2: (otherlv_27= ',' ( ( ruleEString ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==13) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:759:4: otherlv_27= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_27=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSoftware1494); 

                    	        	newLeafNode(otherlv_27, grammarAccess.getSoftwareAccess().getCommaKeyword_11_4_0());
                    	        
                    	    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:763:1: ( ( ruleEString ) )
                    	    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:764:1: ( ruleEString )
                    	    {
                    	    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:764:1: ( ruleEString )
                    	    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:765:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getSoftwareRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getSoftwareAccess().getOrigenFuentesCrossReference_11_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSoftware1517);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleSoftware1531); 

                        	newLeafNode(otherlv_29, grammarAccess.getSoftwareAccess().getRightParenthesisKeyword_11_5());
                        

                    }
                    break;

            }

            otherlv_30=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleSoftware1545); 

                	newLeafNode(otherlv_30, grammarAccess.getSoftwareAccess().getSemicolonKeyword_12());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSoftware"


    // $ANTLR start "ruleArquitectura"
    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:794:1: ruleArquitectura returns [Enumerator current=null] : ( (enumLiteral_0= 'x64' ) | (enumLiteral_1= 'x32' ) ) ;
    public final Enumerator ruleArquitectura() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:796:28: ( ( (enumLiteral_0= 'x64' ) | (enumLiteral_1= 'x32' ) ) )
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:797:1: ( (enumLiteral_0= 'x64' ) | (enumLiteral_1= 'x32' ) )
            {
            // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:797:1: ( (enumLiteral_0= 'x64' ) | (enumLiteral_1= 'x32' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==35) ) {
                alt14=1;
            }
            else if ( (LA14_0==36) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:797:2: (enumLiteral_0= 'x64' )
                    {
                    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:797:2: (enumLiteral_0= 'x64' )
                    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:797:4: enumLiteral_0= 'x64'
                    {
                    enumLiteral_0=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleArquitectura1595); 

                            current = grammarAccess.getArquitecturaAccess().getX64EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getArquitecturaAccess().getX64EnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:803:6: (enumLiteral_1= 'x32' )
                    {
                    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:803:6: (enumLiteral_1= 'x32' )
                    // ../co.edu.uniandes.mono.gesco/src-gen/co/edu/uniandes/mono/gesco/parser/antlr/internal/InternalDSL.g:803:8: enumLiteral_1= 'x32'
                    {
                    enumLiteral_1=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleArquitectura1612); 

                            current = grammarAccess.getArquitecturaAccess().getX32EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getArquitecturaAccess().getX32EnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArquitectura"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleConfiguracion_in_entryRuleConfiguracion75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConfiguracion85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleConfiguracion131 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleConfiguracion143 = new BitSet(new long[]{0x0000000000004030L});
        public static final BitSet FOLLOW_ruleSistemaOperativo_in_ruleConfiguracion165 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_13_in_ruleConfiguracion178 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleSistemaOperativo_in_ruleConfiguracion199 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_14_in_ruleConfiguracion215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSistemaOperativo_in_entryRuleSistemaOperativo251 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSistemaOperativo261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSistemaOperativo316 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSistemaOperativo328 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleSistemaOperativo340 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSistemaOperativo361 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleSistemaOperativo373 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSistemaOperativo394 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleSistemaOperativo406 = new BitSet(new long[]{0x0000001800000000L});
        public static final BitSet FOLLOW_ruleArquitectura_in_ruleSistemaOperativo427 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleSistemaOperativo440 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSistemaOperativo452 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_ruleFuentes_in_ruleSistemaOperativo473 = new BitSet(new long[]{0x0000000000104000L});
        public static final BitSet FOLLOW_ruleFuentes_in_ruleSistemaOperativo494 = new BitSet(new long[]{0x0000000000104000L});
        public static final BitSet FOLLOW_14_in_ruleSistemaOperativo507 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleSistemaOperativo521 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSistemaOperativo533 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleSoftware_in_ruleSistemaOperativo554 = new BitSet(new long[]{0x0000000004004000L});
        public static final BitSet FOLLOW_ruleSoftware_in_ruleSistemaOperativo575 = new BitSet(new long[]{0x0000000004004000L});
        public static final BitSet FOLLOW_14_in_ruleSistemaOperativo588 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleSistemaOperativo600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString637 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFuentes_in_entryRuleFuentes759 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFuentes769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleFuentes815 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleFuentes827 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFuentes848 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleFuentes860 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleFuentes872 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFuentes893 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleFuentes905 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleFuentes917 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFuentes938 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleFuentes950 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleFuentes962 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFuentes983 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleFuentes995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSoftware_in_entryRuleSoftware1031 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSoftware1041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleSoftware1087 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleSoftware1099 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSoftware1120 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleSoftware1133 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleSoftware1145 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSoftware1166 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleSoftware1181 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleSoftware1193 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSoftware1214 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleSoftware1228 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleSoftware1240 = new BitSet(new long[]{0x0000001800000000L});
        public static final BitSet FOLLOW_ruleArquitectura_in_ruleSoftware1261 = new BitSet(new long[]{0x0000000002002000L});
        public static final BitSet FOLLOW_13_in_ruleSoftware1274 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleSoftware1286 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSoftware1307 = new BitSet(new long[]{0x0000000002002000L});
        public static final BitSet FOLLOW_13_in_ruleSoftware1322 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleSoftware1334 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleSoftware1346 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSoftware1369 = new BitSet(new long[]{0x0000000200002000L});
        public static final BitSet FOLLOW_13_in_ruleSoftware1382 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSoftware1405 = new BitSet(new long[]{0x0000000200002000L});
        public static final BitSet FOLLOW_33_in_ruleSoftware1419 = new BitSet(new long[]{0x0000000002002000L});
        public static final BitSet FOLLOW_13_in_ruleSoftware1434 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleSoftware1446 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleSoftware1458 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSoftware1481 = new BitSet(new long[]{0x0000000200002000L});
        public static final BitSet FOLLOW_13_in_ruleSoftware1494 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSoftware1517 = new BitSet(new long[]{0x0000000200002000L});
        public static final BitSet FOLLOW_33_in_ruleSoftware1531 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleSoftware1545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleArquitectura1595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleArquitectura1612 = new BitSet(new long[]{0x0000000000000002L});
    }


}