package co.edu.uniandes.mono.gesco.serializer;

import Gesco.Configuracion;
import Gesco.Fuentes;
import Gesco.GescoPackage;
import Gesco.SistemaOperativo;
import Gesco.Software;
import co.edu.uniandes.mono.gesco.services.DSLGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public abstract class AbstractDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DSLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == GescoPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case GescoPackage.CONFIGURACION:
				if(context == grammarAccess.getConfiguracionRule()) {
					sequence_Configuracion(context, (Configuracion) semanticObject); 
					return; 
				}
				else break;
			case GescoPackage.FUENTES:
				if(context == grammarAccess.getFuentesRule()) {
					sequence_Fuentes(context, (Fuentes) semanticObject); 
					return; 
				}
				else break;
			case GescoPackage.SISTEMA_OPERATIVO:
				if(context == grammarAccess.getSistemaOperativoRule()) {
					sequence_SistemaOperativo(context, (SistemaOperativo) semanticObject); 
					return; 
				}
				else break;
			case GescoPackage.SOFTWARE:
				if(context == grammarAccess.getSoftwareRule()) {
					sequence_Software(context, (Software) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     ((sistemaOperativo+=SistemaOperativo sistemaOperativo+=SistemaOperativo*)?)
	 */
	protected void sequence_Configuracion(EObject context, Configuracion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString autor=EString fuente=EString tipoFuente=EString)
	 */
	protected void sequence_Fuentes(EObject context, Fuentes semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GescoPackage.Literals.FUENTES__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GescoPackage.Literals.FUENTES__NAME));
			if(transientValues.isValueTransient(semanticObject, GescoPackage.Literals.FUENTES__AUTOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GescoPackage.Literals.FUENTES__AUTOR));
			if(transientValues.isValueTransient(semanticObject, GescoPackage.Literals.FUENTES__FUENTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GescoPackage.Literals.FUENTES__FUENTE));
			if(transientValues.isValueTransient(semanticObject, GescoPackage.Literals.FUENTES__TIPO_FUENTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GescoPackage.Literals.FUENTES__TIPO_FUENTE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFuentesAccess().getNameEStringParserRuleCall_3_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getFuentesAccess().getAutorEStringParserRuleCall_6_0(), semanticObject.getAutor());
		feeder.accept(grammarAccess.getFuentesAccess().getFuenteEStringParserRuleCall_9_0(), semanticObject.getFuente());
		feeder.accept(grammarAccess.getFuentesAccess().getTipoFuenteEStringParserRuleCall_12_0(), semanticObject.getTipoFuente());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         version=EString 
	 *         descripcion=EString 
	 *         arquitectura=Arquitectura 
	 *         (fuentes+=Fuentes fuentes+=Fuentes*)? 
	 *         requerimientos+=Software 
	 *         requerimientos+=Software*
	 *     )
	 */
	protected void sequence_SistemaOperativo(EObject context, SistemaOperativo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         version=EString? 
	 *         descripcion=EString? 
	 *         arquitectura=Arquitectura 
	 *         rutaDestino=EString? 
	 *         (dependencia+=[Software|EString] dependencia+=[Software|EString]*)? 
	 *         (origen+=[Fuentes|EString] origen+=[Fuentes|EString]*)?
	 *     )
	 */
	protected void sequence_Software(EObject context, Software semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
