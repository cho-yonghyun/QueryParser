package queryParser.Comm;


public class FunctionNameEnum {
	
	// FUNCTION (ORACLE)
	// http://docs.oracle.com/cd/B19306_01/server.102/b14200/functions001.htm
	public enum FUNCTION {
		// Numeric Functions
		ABS("ABS"), ACOS("ACOS"), ASIN("ASIN"), ATAN("ATAN"), ATAN2("ATAN2"),
		BITAND("BITAND"), CEIL("CEIL"), COS("COS"), COSH("COSH"), EXP("EXP"), 
		FLOOR("FLOOR"), LN("LN"), LOG("LOG"), MOD("MOD"), NANVL("NANVL"),
		POWER("POWER"), REMAINDER("REMAINDER"), ROUND("ROUND"), SIGN("SIGN"), SIN("SIN"), 
		SINH("SINH"), SQRT("SQRT"), TAN("TAN"), TANH("TANH"), TRUNC("TRUNC"),
		WIDTH_BUCKET("WIDTH_BUCKET"),
		
		// Character Functions Returning Character Values
		CHR("CHR"), CONCAT("CONCAT"), INITCAP("INITCAP"), LOWER("LOWER"), LPAD("LPAD"),
		LTRIM("LTRIM"), NLS_INITCAP("NLS_INITCAP"), NLS_LOWER("NLS_LOWER"), NLSSORT("NLSSORT"), NLS_UPPER("NLS_UPPER"),
		REGEXP_REPLACE("REGEXP_REPLACE"), REGEXP_SUBSTR("REGEXP_SUBSTR"), REPLACE("REPLACE"), RPAD("RPAD"), RTRIM("RTRIM"),
		SOUNDEX("SOUNDEX"), SUBSTR("SUBSTR"), TREAT("TREAT"), TRIM("TRIM"), UPPER("UPPER"), 

		// NLS Character Functions
		NLS_CHARSET_DECL_LEN("NLS_CHARSET_DECL_LEN"), NLS_CHARSET_ID("NLS_CHARSET_ID"), 
		NLS_CHARSET_NAME("NLS_CHARSET_NAME"), 

		// Character Functions Returning Number Values
		ASCII("ASCII"), INSTR("INSTR"), LENGTH("LENGTH"), REGEXP_INSTR("REGEXP_INSTR"), 

		// Datetime Functions
		ADD_MONTHS("ADD_MONTHS"), CURRENT_DATE("CURRENT_DATE"), CURRENT_TIMESTAMP("CURRENT_TIMESTAMP"), DBTIMEZONE("DBTIMEZONE"), EXTRACT("EXTRACT"),
		FROM_TZ("FROM_TZ"), LAST_DAY("LAST_DAY"), LOCALTIMESTAMP("LOCALTIMESTAMP"), MONTHS_BETWEEN("MONTHS_BETWEEN"), NEW_TIME("NEW_TIME"),
		NEXT_DAY("NEXT_DAY"), SESSIONTIMEZONE("SESSIONTIMEZONE"), SYS_EXTRACT_UTC("SYS_EXTRACT_UTC"), SYSDATE("SYSDATE"),
		SYSTIMESTAMP("SYSTIMESTAMP"), TZ_OFFSET("TZ_OFFSET"), 

		// General Comparison Functions
		GREATEST("GREATEST"), LEAST("LEAST"), 

		// Conversion Functions
		ASCIISTR("ASCIISTR"), BIN_TO_NUM("BIN_TO_NUM"), CAST("CAST"), CHARTOROWID("CHARTOROWID"), COMPOSE("COMPOSE"),
		CONVERT("CONVERT"), DECOMPOSE("DECOMPOSE"), HEXTORAW("HEXTORAW"), NUMTODSINTERVAL("NUMTODSINTERVAL"), NUMTOYMINTERVAL("NUMTOYMINTERVAL"),
		RAWTOHEX("RAWTOHEX"), RAWTONHEX("RAWTONHEX"), ROWIDTOCHAR("ROWIDTOCHAR"), ROWIDTONCHAR("ROWIDTONCHAR"), SCN_TO_TIMESTAMP("SCN_TO_TIMESTAMP"),
		TIMESTAMP_TO_SCN("TIMESTAMP_TO_SCN"), TO_BINARY_DOUBLE("TO_BINARY_DOUBLE"), TO_BINARY_FLOAT("TO_BINARY_FLOAT"), TO_CHAR("TO_CHAR"), TO_CLOB("TO_CLOB"),
		TO_DATE("TO_DATE"), TO_DSINTERVAL("TO_DSINTERVAL"), TO_LOB("TO_LOB"), TO_MULTI_BYTE("TO_MULTI_BYTE"), TO_NCHAR("TO_NCHAR"),
		TO_NCLOB("TO_NCLOB"), TO_NUMBER("TO_NUMBER"), TO_SINGLE_BYTE("TO_SINGLE_BYTE"), TO_TIMESTAMP("TO_TIMESTAMP"), TO_TIMESTAMP_TZ("TO_TIMESTAMP_TZ"),
		TO_YMINTERVAL("TO_YMINTERVAL"), TRANSLATE("TRANSLATE"), UNISTR("UNISTR"),

		// Large Object Functions
		BFILENAME("BFILENAME"), EMPTY_BLOB("EMPTY_BLOB"), EMPTY_CLOB("EMPTY_CLOB"), 

		// Collection Functions
		CARDINALITY("CARDINALITY"), COLLECT("COLLECT"), POWERMULTISET("POWERMULTISET"), POWERMULTISET_BY_CARDINALITY("POWERMULTISET_BY_CARDINALITY"), SET("SET"), 
		
		// Hierarchical Function
		SYS_CONNECT_BY_PATH("SYS_CONNECT_BY_PATH"),
		
		// Data Mining Functions
		CLUSTER_ID("CLUSTER_ID"), CLUSTER_PROBABILITY("CLUSTER_PROBABILITY"), CLUSTER_SET("CLUSTER_SET"), FEATURE_ID("FEATURE_ID"), FEATURE_SET("FEATURE_SET"),
		FEATURE_VALUE("FEATURE_VALUE"), PREDICTION("PREDICTION"), PREDICTION_COST("PREDICTION_COST"), PREDICTION_DETAILS("PREDICTION_DETAILS"), PREDICTION_PROBABILITY("PREDICTION_PROBABILITY"),
		PREDICTION_SET("PREDICTION_SET"), 

		// XML Functions
		APPENDCHILDXML("APPENDCHILDXML"), DELETEXML("DELETEXML"), DEPTH("DEPTH"), EXISTSNODE("EXISTSNODE"), EXTRACTVALUE("EXTRACTVALUE"),
		INSERTCHILDXML("INSERTCHILDXML"), INSERTXMLBEFORE("INSERTXMLBEFORE"), PATH("PATH"), SYS_DBURIGEN("SYS_DBURIGEN"), SYS_XMLAGG("SYS_XMLAGG"),
		SYS_XMLGEN("SYS_XMLGEN"), UPDATEXML("UPDATEXML"), XMLAGG("XMLAGG"), XMLCDATA("XMLCDATA"), XMLCOLATTVAL("XMLCOLATTVAL"),
		XMLCOMMENT("XMLCOMMENT"), XMLCONCAT("XMLCONCAT"), XMLFOREST("XMLFOREST"), XMLPARSE("XMLPARSE"), XMLPI("XMLPI"),
		XMLQUERY("XMLQUERY"), XMLROOT("XMLROOT"), XMLSEQUENCE("XMLSEQUENCE"), XMLSERIALIZE("XMLSERIALIZE"), XMLTABLE("XMLTABLE"),
		XMLTRANSFORM("XMLTRANSFORM"), 

		// Encoding and Decoding Functions
		DECODE("DECODE"), DUMP("DUMP"), ORA_HASH("ORA_HASH"), VSIZE("VSIZE"), 

		// NULL-Related Functions
		COALESCE("COALESCE"), LNNVL("LNNVL"), NULLIF("NULLIF"), NVL("NVL"), NVL2("NVL2"), 

		// Environment and Identifier Functions
		COASYS_CONTEXT("COASYS_CONTEXT"), SYS_GUID("SYS_GUID"), SYS_TYPEID("SYS_TYPEID"), UID("UID"), USER("USER"),
		USERENVLESCE("USERENVLESCE"),

		// Aggregate Functions
		AVG("AVG"), CORR("CORR"), CORR_S("CORR_S"), CORR_K("CORR_K"), COUNT("COUNT"),
		COVAR_POP("COVAR_POP"), COVAR_SAMP("COVAR_SAMP"), CUME_DIST("CUME_DIST"), DENSE_RANK("DENSE_RANK"), FIRST("FIRST"),
		GROUP_ID("GROUP_ID"), GROUPING("GROUPING"), GROUPING_ID("GROUPING_ID"), LAST("LAST"), MAX("MAX"),
		MEDIAN("MEDIAN"), MIN("MIN"), PERCENTILE_CONT("PERCENTILE_CONT"), PERCENTILE_DISC("PERCENTILE_DISC"), PERCENT_RANK("PERCENT_RANK"), 
		RANK("RANK"), REGR_SLOPE("REGR_SLOPE"), REGR_INTERCEPT("REGR_INTERCEPT"), REGR_COUNT("REGR_COUNT"), REGR_R2("REGR_R2"),
		REGR_AVGX("REGR_AVGX"), REGR_AVGY("REGR_AVGY"), REGR_SXX("REGR_SXX"), REGR_SYY("REGR_SYY"), REGR_SXY("REGR_SXY"),
		STATS_BINOMIAL_TEST("STATS_BINOMIAL_TEST"), STATS_CROSSTAB("STATS_CROSSTAB"), STATS_F_TEST("STATS_F_TEST"), STATS_KS_TEST("STATS_KS_TEST"), STATS_MODE("STATS_MODE"),
		STATS_MW_TEST("STATS_MW_TEST"), STATS_ONE_WAY_ANOVA("STATS_ONE_WAY_ANOVA"), STATS_T_TEST_ONE("STATS_T_TEST_ONE"), STATS_T_TEST_PAIRED("STATS_T_TEST_PAIRED"), STATS_T_TEST_INDEP("STATS_T_TEST_INDEP"),
		STATS_T_TEST_INDEPU("STATS_T_TEST_INDEPU"), STATS_WSR_TEST("STATS_WSR_TEST"), STDDEV("STDDEV"), STDDEV_POP("STDDEV_POP"), STDDEV_SAMP("STDDEV_SAMP"),
		SUM("SUM"), VAR_POP("VAR_POP"), VAR_SAMP("VAR_SAMP"), VARIANCE("VARIANCE"); 
		private String value;
		
		private FUNCTION(String value){
			this.value = value; 
		}
		
		public String getValue(){
			return value;
		}
		
		public static FUNCTION getEnum(String value) throws Exception {
			FUNCTION function = null;
			
			for(FUNCTION v : values()) {
	            if(v.getValue().equalsIgnoreCase(value)){ 
	            	function = v;
	            	break;
	            }
	        }
			
			if(function == null){
				throw new Exception("올바르지 않은 합수명 입니다.");
				
			}else{
				return function;
			}
	    }
	}
}
