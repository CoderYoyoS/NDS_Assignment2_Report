import java.io.*;
import java.util.Arrays;

public class Build {

    public static void main(String[] args) throws IOException,Exception {

        File frontMaterial = new File(System.getProperty("user.dir")+"/00_front_material");
        File introduction = new File(System.getProperty("user.dir")+"/01_sections/00_introduction");
        File sys_overview = new File(System.getProperty("user.dir")+"/01_sections/01_system_overview");
        File method = new File(System.getProperty("user.dir")+"/01_sections/02_methodology");
        File test_cases = new File(System.getProperty("user.dir")+"/01_sections/03_test_cases");
        File test_params = new File(System.getProperty("user.dir")+"/01_sections/04_test_parameters");
        File results = new File(System.getProperty("user.dir")+"/01_sections/05_results");
        File analysis = new File(System.getProperty("user.dir")+"/01_sections/06_analysis");
        File conclusion = new File(System.getProperty("user.dir")+"/01_sections/07_conclusions_furtherwork");
        File appendices = new File(System.getProperty("user.dir")+"/02_appendices");
        File references = new File(System.getProperty("user.dir")+"/03_references");

        FilenameFilter fileFilter = new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.toLowerCase().endsWith(".md");
            }
        };

        File[] frontMaterialFiles = frontMaterial.listFiles(fileFilter);
        File[] introFiles = introduction.listFiles(fileFilter);
        File[] sys_overview_files = sys_overview.listFiles(fileFilter);
        File[] method_files = method.listFiles(fileFilter);
        File[] test_case_files = test_cases.listFiles(fileFilter);
        File[] test_params_files = test_params.listFiles(fileFilter);
        File[] results_files = results.listFiles(fileFilter);
        File[] analysis_files = analysis.listFiles(fileFilter);
        File[] conclusion_files = conclusion.listFiles(fileFilter);
        File[] appendicesFiles = appendices.listFiles(fileFilter);
        File[] referencesFiles = references.listFiles(fileFilter);

        String[] frontMaterialFileNames = new String[frontMaterialFiles.length];
        String[] introFileNames = new String[introFiles.length];
        String[] sys_overview_filenames = new String[sys_overview_files.length];
        String[] method_filenames = new String[method_files.length];
        String[] sys_req_filenames = new String[test_case_files.length];
        String[] test_params_filenames = new String[test_params_files.length];
        String[] results_filenames = new String[results_files.length];
        String[] analysis_filenames = new String[analysis_files.length];
        String[] conclusion_filenames = new String[conclusion_files.length];
        String[] appendicesFileNames = new String[appendicesFiles.length];
        String[] referncesFileNames = new String[referencesFiles.length];

		int i=0;
		for (File file : frontMaterialFiles) {
			if (file.isDirectory()) {
				System.out.print("Don't create anymore directories in here!!!!");
			}
			else if(file.isFile()) {
				frontMaterialFileNames[i] = file.getCanonicalPath();
				i++;
			}
		}

		i=0;
		for (File file : introFiles) {
			if (file.isDirectory()) {
				System.out.print("Don't create anymore directories in here!!!!");
			} else {
				introFileNames[i] = file.getCanonicalPath();
				i++;
			}
		}

		i=0;
		for (File file : sys_overview_files) {
			if (file.isDirectory()) {
				System.out.print("Don't create anymore directories in here!!!!");
			} else {
				sys_overview_filenames[i] = file.getCanonicalPath();
				i++;
			}
		}

		i=0;
		for (File file : method_files) {
			if (file.isDirectory()) {
				System.out.print("Don't create anymore directories in here!!!!");
			} else {
				method_filenames[i] = file.getCanonicalPath();
				i++;
			}
		}

		i=0;
		for (File file : test_case_files) {
			if (file.isDirectory()) {
				System.out.print("Don't create anymore directories in here!!!!");
			} else {
				sys_req_filenames[i] = file.getCanonicalPath();
				i++;
			}
		}

		i=0;
		for (File file : test_params_files) {
			if (file.isDirectory()) {
				System.out.print("Don't create anymore directories in here!!!!");
			} else {
				test_params_filenames[i] = file.getCanonicalPath();
				i++;
			}
		}

		i=0;
		for (File file : results_files) {
			if (file.isDirectory()) {
				System.out.print("Don't create anymore directories in here!!!!");
			} else {
				results_filenames[i] = file.getCanonicalPath();
				i++;
			}
		}

		i=0;
		for (File file : analysis_files) {
			if (file.isDirectory()) {
				System.out.print("Don't create anymore directories in here!!!!");
			} else {
				analysis_filenames[i] = file.getCanonicalPath();
				i++;
			}
		}

		i=0;
		for (File file : conclusion_files) {
			if (file.isDirectory()) {
				System.out.print("Don't create anymore directories in here!!!!");
			} else {
				conclusion_filenames[i] = file.getCanonicalPath();
				i++;
			}
		}

		i=0;
		for (File file : appendicesFiles) {
			if (file.isDirectory()) {
				System.out.print("Don't create anymore directories in here!!!!");
			} else {
				appendicesFileNames[i] = file.getCanonicalPath();
				i++;
			}
		}

		i=0;
		for (File file : referencesFiles) {
			if (file.isDirectory()) {
				System.out.print("Don't create anymore directories in here!!!!");
			} else {
				referncesFileNames[i] = file.getCanonicalPath();
				i++;
			}
		}

		String frontmatpaths = "";
		for(int t = 0; t < frontMaterialFileNames.length; t++){
			frontmatpaths += frontMaterialFileNames[t]+" ";
		}

		String intropaths = "";
		for(int t = 0; t < introFileNames.length; t++){
			intropaths += introFileNames[t]+" "; 
		}

		String sys_overview_paths = "";
		for(int t = 0; t < sys_overview_filenames.length; t++){
			sys_overview_paths += sys_overview_filenames[t]+" ";
		}

		String methodpaths = "";
		for(int t = 0; t < method_filenames.length; t++){
			methodpaths += method_filenames[t]+" "; 
		}

		String sysreqpaths = "";
		for(int t = 0; t <  sys_req_filenames.length; t++){
			sysreqpaths +=  sys_req_filenames[t]+" "; 
		}

		String test_params_paths = "";
		for(int t = 0; t < test_params_filenames.length; t++){
			test_params_paths += test_params_filenames[t]+" ";
		}

		String results_paths = "";
		for(int t = 0; t < results_filenames.length; t++){
			results_paths += results_filenames[t]+" ";
		}

		String analysis_paths = "";
		for(int t = 0; t < analysis_filenames.length; t++){
			analysis_paths += analysis_filenames[t]+" ";
		}

		String conclusionpaths = "";
		for(int t = 0; t < conclusion_filenames.length; t++){
			conclusionpaths += conclusion_filenames[t]+" "; 
		}

		String appendpaths = "";
		for(int t = 0; t < appendicesFileNames.length; t++){
			appendpaths += appendicesFileNames[t]+" "; 
		}

        ProcessBuilder builder = new ProcessBuilder(
				"cmd.exe", "/c"+"pandoc --latex-engine=xelatex -H "+
				"_config/preamble.tex -V fontsize=10pt -V documentclass:book"+
				" -V papersize:a4paper -V classoption:oneside --number-sections "+
				frontmatpaths+
				"_config/toc.md "+
				intropaths+
				sys_overview_paths+
				methodpaths+
				sysreqpaths+
				test_params_paths+
				results_paths+
				analysis_paths+
				conclusionpaths+
				appendpaths+
				"03_references/references.md"+
				" -o B00029598_B00082716_B00079288_Homan_Kelly_Ward_NDS_Assignment2_Report.pdf"
            );

		builder.redirectErrorStream(true);
		Process p = builder.start();
		BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
		String line;
		while (true) {
			line = r.readLine();
			if (line == null) {
				break;
		}
		System.out.println(line);
        }
     }
}