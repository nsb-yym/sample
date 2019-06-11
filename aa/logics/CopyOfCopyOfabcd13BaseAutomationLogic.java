import com.nexacro.xapi.data.ColumnHeader;
import com.nexacro.xapi.data.DataSet;
import com.nexacro.xapi.data.datatype.DataType;
import com.nexacro.xapi.data.datatype.MashupDataType;
import com.nexacro.xapi.data.datatype.PlatformDataType;
import com.nexacro.xapi.data.datatype.SqlDataType;
import com.nexacro.xup.Parameter;
import com.nexacro.xup.ParameterSet;
import com.nexacro.xup.bundle.datasource.DataSourceEvent;
import com.nexacro.xup.bundle.datasource.db.DbDataSourceEvent;
import com.nexacro.xup.bundle.datasource.openapi.OpenApiDataSourceEvent;
import com.nexacro.xup.bundle.datasource.sap.SapRfcDataSourceEvent;
import com.nexacro.xup.bundle.datasource.ws.WSDataSourceEvent;
import com.nexacro.xup.bundle.invoker.EventHandler;
import com.nexacro.xup.bundle.invoker.FlowEvent;
import com.nexacro.xup.bundle.invoker.InvokingInfo;
import com.nexacro.xup.bundle.invoker.ResultNameSet;
import com.nexacro.xup.bundle.invoker.as400.AS400FlowEvent;
import com.nexacro.xup.bundle.invoker.as400.AS400InvokingInfo;
import com.nexacro.xup.bundle.invoker.dbmodify.DbModifyFlowEvent;
import com.nexacro.xup.bundle.invoker.dbmodify.DbModifyInvokingInfo;
import com.nexacro.xup.bundle.invoker.dbprocedure.DbProcedureFlowEvent;
import com.nexacro.xup.bundle.invoker.dbprocedure.DbProcedureInvokingInfo;
import com.nexacro.xup.bundle.invoker.dbselect.DbSelectFlowEvent;
import com.nexacro.xup.bundle.invoker.dbselect.DbSelectInvokingInfo;
import com.nexacro.xup.bundle.invoker.merge.MergeFlowEvent;
import com.nexacro.xup.bundle.invoker.merge.MergeInvokingInfo;
import com.nexacro.xup.bundle.invoker.model.ModelFlowEvent;
import com.nexacro.xup.bundle.invoker.model.ModelInvokingInfo;
import com.nexacro.xup.bundle.invoker.openapi.OpenApiFlowEvent;
import com.nexacro.xup.bundle.invoker.openapi.OpenApiInvokingInfo;
import com.nexacro.xup.bundle.invoker.qmerge.QMergeDataSetHashInfo;
import com.nexacro.xup.bundle.invoker.qmerge.QMergeDataSetSortInfo;
import com.nexacro.xup.bundle.invoker.qmerge.QMergeFlowEvent;
import com.nexacro.xup.bundle.invoker.qmerge.QMergeInvokingInfo;
import com.nexacro.xup.bundle.invoker.saprfc.SapRfcFlowEvent;
import com.nexacro.xup.bundle.invoker.saprfc.SapRfcInvokingInfo;
import com.nexacro.xup.bundle.invoker.ws.WSFlowEvent;
import com.nexacro.xup.bundle.invoker.ws.WSInvokingInfo;
import com.nexacro.xup.bundle.invoker.xmlparser.XmlParserInvokingInfo;
import com.nexacro.xup.bundle.invoker.xup.XupInvokingInfo;
import com.nexacro.xup.bundle.invoker.xupclient.XupFlowEvent;
import com.nexacro.xup.component.automation.AutomationFailException;
import com.nexacro.xup.component.automation.InvokeSkip;
import com.nexacro.xup.component.automation.RowSkip;
import com.nexacro.xup.component.gatherer.ParsedRawData;
import com.nexacro.xup.component.gatherer.RawData;
import com.nexacro.xup.data.MashupFile;
import com.nexacro.xup.data.MashupHeader;
import com.nexacro.xup.data.MashupParameter;
import com.nexacro.xup.model.BaseAutomationLogic;
import com.nexacro.xup.model.automation.InvokingErrorInfo;
import com.nexacro.xup.model.automation.SqlTypeBindingInfo;
import com.nexacro.xup.model.automation.TypeBindingInfo;
import com.nexacro.xup.model.datasource.DataSource;
import com.nexacro.xup.util.condition.Condition;
import com.nexacro.xup.util.condition.dbModify.DataSetRowProcessConditionInfoSet;
import com.nexacro.xup.util.condition.xmlParser.XmlParserConditionInfo;
import com.nexacro.xup.util.condition.xmlParser.XmlParserConditionInfoSet;
import com.nexacro.xup.util.data.ParsingFailException;
import com.nexacro.xup.util.data.XmlParser;
import com.nexacro.xup.util.data.XmlParsingInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CopyOfCopyOfabcd13BaseAutomationLogic extends BaseAutomationLogic {

	public ParameterSet execute(ParameterSet inputParameterSet) throws AutomationFailException{
		ParameterSet outputParameterSet = new ParameterSet();
		ParameterSet globalParameterSet = new ParameterSet();
		globalParameterSet.add(inputParameterSet);
		initParameterSet(globalParameterSet);
		start(globalParameterSet);
		
		modify(globalParameterSet);

		
		end(globalParameterSet, outputParameterSet);
		return outputParameterSet;
	}
	private void initParameterSet(ParameterSet globalParameterSet) {
	}
	public void start(ParameterSet globalParameterSet)throws AutomationFailException {//!findOffset_start!
	}
	public void end(ParameterSet globalParameterSet, ParameterSet outputParameterSet)throws AutomationFailException {//!findOffset_end!
	}
	public void modify(ParameterSet globalParameterSet) throws AutomationFailException {//!findOffset_modify!
		ParameterSet tmpParameterSet = new ParameterSet();

		ResultNameSet resultNameSet = new ResultNameSet();

		// defaultBindingValueMap
		Map defaultBindingValueMap = new HashMap();
		// SqlTypeBindingInfo
		SqlTypeBindingInfo sqlTypeBindingInfo = new SqlTypeBindingInfo();
		sqlTypeBindingInfo.setUseDefaultBinding(true);
		// DataSetRowActionFilter
		DataSetRowProcessConditionInfoSet dataSetRowActionFilter = new DataSetRowProcessConditionInfoSet();
		DbModifyInvokingInfo info = new DbModifyInvokingInfo();
		info.setDomainName("aa");
		info.setDataSourceName("");
		info.setSqlInsert("");
		info.setSqlUpdate("");
		info.setSqlDelete("");
		info.setResultNameSet(resultNameSet);
		info.setParameterSet(tmpParameterSet);
		info.setLoopTargetDataSetName("");
		info.setSqlTypeBindingInfo(sqlTypeBindingInfo);
		info.setDataSetRowActionFilter(dataSetRowActionFilter);
		info.setDefaultBindingValueMap(defaultBindingValueMap);
		// DbModifyDataSourceEvent
		DbDataSourceEvent dataSourceEvent = new DbDataSourceEvent() {
			public void onBeforeExecute(ParameterSet globalParameterSet, InvokingInfo invokingInfo, DataSource dataSource) throws AutomationFailException {//!findOffset_modifyonBeforeExecute!
				modifyonBeforeExecute(globalParameterSet, invokingInfo, dataSource);
			}
			public void onAfterExecute(ParameterSet globalParameterSet, InvokingInfo invokingInfo, DataSource dataSource) throws AutomationFailException {//!findOffset_modifyonAfterExecute!
				modifyonAfterExecute(globalParameterSet, invokingInfo, dataSource);
			}
		};
		// DbModifyFlowEvent
		DbModifyFlowEvent event = new DbModifyFlowEvent() {
			public void onBeforeInsert(ParameterSet globalParameterSet, ParameterSet inputParameterSet, InvokingInfo invokingInfo, int rowIndex) throws AutomationFailException{
			
			}
			public void onBeforeUpdate(ParameterSet globalParameterSet, ParameterSet inputParameterSet, InvokingInfo invokingInfo, int rowIndex) throws AutomationFailException{
			
			}
			public void onBeforeDelete(ParameterSet globalParameterSet, ParameterSet inputParameterSet, InvokingInfo invokingInfo, int rowIndex) throws AutomationFailException{
			
			}
			public void onAfterInsert(ParameterSet globalParameterSet, ParameterSet inputParameterSet, InvokingInfo invokingInfo, int rowIndex) throws AutomationFailException{
			
			}
			public void onAfterUpdate(ParameterSet globalParameterSet, ParameterSet inputParameterSet, InvokingInfo invokingInfo, int rowIndex) throws AutomationFailException{
			
			}
			public void onAfterDelete(ParameterSet globalParameterSet, ParameterSet inputParameterSet, InvokingInfo invokingInfo, int rowIndex) throws AutomationFailException{
			
			}
			public void onBegin(ParameterSet globalParameterSet, ParameterSet inputParameterSet, InvokingInfo invokingInfo) throws AutomationFailException {//!findOffset_modifyonBegin!
			
			}
			public void onEnd(ParameterSet globalParameterSet, ParameterSet inputParameterSet, InvokingInfo invokingInfo) throws AutomationFailException {//!findOffset_modifyonEnd!
			
			}
			public void onExceptionOccured(ParameterSet globalParameterSet, InvokingInfo invokingInfo, Throwable e, InvokingErrorInfo errorInfo) throws AutomationFailException {//!findOffset_modifyonExceptionOccured!
				modifyonExceptionOccured(globalParameterSet, invokingInfo, e, errorInfo);
			}
		};
		EventHandler eventHandler = new EventHandler();
		eventHandler.addEvent(event);
		eventHandler.addEvent(dataSourceEvent);
		invoke(info, eventHandler, globalParameterSet);

	}
	public void modifyonAfterExecute(ParameterSet globalParameterSet, InvokingInfo invokingInfo, DataSource dataSource) throws AutomationFailException {
		
	}
	public void modifyonBeforeExecute(ParameterSet globalParameterSet, InvokingInfo invokingInfo, DataSource dataSource) throws AutomationFailException {
		
	}
	public void modifyonExceptionOccured(ParameterSet globalParameterSet, InvokingInfo invokingInfo, Throwable e, InvokingErrorInfo errorInfo) throws AutomationFailException {
		throw new AutomationFailException(e.getMessage(), e);
	}


}