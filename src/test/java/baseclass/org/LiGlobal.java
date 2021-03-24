package baseclass.org;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import javax.lang.model.element.Element;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class LiGlobal {	
	
	 public static WebDriver driver;
	 
	 public static void loadBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aslam\\eclipse-workspace\\selenium\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	 public static void loadUrl(String url) {
		driver.get(url);
	}	 
	 public static void toMaximize() {
		driver.manage().window().maximize();
	}
	 public static void togetTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	 public static void toClose() {
		driver.close();

	}
	 public static void togetCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	 public static void toType(WebElement element,String value) {
		element.sendKeys(value);
	}
	 public static void toclick(WebElement element) {
		element.click();
	}
	 public static void tosleep(long ms) throws InterruptedException {
		Thread.sleep(ms);
	}
	 
	public static void toActions(WebElement element) {
		Actions a=new Actions(driver);
		a.moveToElement(element).perform();

	}
	public static void toXButton(WebElement element) {
		element.click();

	}
	public static void toActionsRc(WebElement element) {
		Actions a=new Actions(driver);
		a.contextClick().perform();
	}
	public static void toActionsDC(WebElement element) {
		Actions a=new Actions(driver);
		a.doubleClick().perform();
	} 
	public static void toActionsDD(WebElement source, WebElement target) {
		Actions a=new Actions(driver);
		a.dragAndDrop(source, target).perform();

	}
	public static void toActionsKUD(WebElement element,String keys ) {
		Actions a=new Actions(driver);
		a.keyDown(element, Keys.SHIFT).sendKeys(keys).keyUp(element, Keys.SHIFT).perform();
	}
	
	public static void toSimmpleAlert() {
		Alert a=driver.switchTo().alert();
		a.accept();
	}
	public static void toConfirmAlert() {
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
	}
	public static void toPromptAlert(String value) {
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.sendKeys(value);
		a.accept();
	}
	public static void toFrameId(String Id) {
		driver.switchTo().frame("Id");
	} 
	public static void toFrameIndex(String Index) {
		driver.switchTo().frame(Index);
	} 
	public static void toFrameref(String ref) {
		driver.switchTo().frame(ref);
	}
	public static void toFrameName(String name) {
		driver.switchTo().frame(name);
	}
//	public static void toCountFrame(String allFrame) {
//		int size = allFrame.size();
//		System.out.println(size);
//	}
	public static void toParentFrame() {
		driver.switchTo().parentFrame();
	}
	public static void todefaultContent() {
		driver.switchTo().defaultContent();
	}
	public static void tojavaScriptDown(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	} 
	public static void tojavaScriptUp(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);
	} 
	public static void tojavaScriptSet(String value1,WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','value1')", element);

	} 
	public static void tojavaScriptGet(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("return arguments[0].getAttribute('value')", element);
	} 
	public static void tojavaScriptClick(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element);
	}
	public static void toTakeScreenShot() throws IOException {
		TakesScreenshot tk=(TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Aslam\\eclipse-workspace\\selenium\\Screenshot\\element.png");
		FileUtils.copyFile(src, des);	
	} 
	public static void toDropDownmultitrue(WebElement element,Integer index) {
		Select s=new Select(element);
		boolean multiple = s.isMultiple();
		if (multiple==true) {
			System.out.println("Multiple Options can be Selected");
		}
		else {
			System.out.println("One option can be Selected");
		}
		s.selectByIndex(index);
	}
	public static void toDropDownmultifalse(WebElement element,Integer index) {
		Select s=new Select(element);
		boolean multiple = s.isMultiple();
		if (multiple==false) {
			System.out.println("Multiple Options can be Selected");
		}
		else {
			System.out.println("One option can be Selected");
		}
		s.selectByIndex(index);
	}
	public static void toDropDownFirstSelect(WebElement element) {
		Select s=new Select(element);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement eachselect : allSelectedOptions) {
			System.out.println(eachselect.getText());
		}
		

	}
	
//	private void towindowsId() {
//		// TODO Auto-generated method stub
//
//	}
	public static void toDropDownSelectAll(WebElement element) {
		Select s=new Select(element);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (int j = 0; j < allSelectedOptions.size(); j++) {
		WebElement selected = allSelectedOptions.get(j);
		String text = selected.getText();
		System.out.println(text);
		
		}
	}
	 public static void toAlloptions(WebElement element) {
		 Select s=new Select(element);
		 List<WebElement> options = s.getOptions();
		 for (WebElement option : options) {
			 System.out.println(option.getText());
			
		}
			
	}

	 public static void toparentId() {
		String parent = driver.getWindowHandle();
		System.out.println(parent);
	 }
	
//	 public static void toAllWindowsId(WebElement element) {
//		Set<String> windowHandles = driver.getWindowHandles();
//		System.out.println(windowHandles);
//	for (String eachId : windowHandles) {
//		if (!eachId.equals(element)) {
//			driver.switchTo().window(eachId).click();
//		}
//	}
//	 }
	
	 
	 public static void toRow(String id) {
		 WebElement table = driver.findElement(By.id(id));
		List< WebElement> allrows = table.findElements(By.tagName("tr"));
		for (WebElement eachrow : allrows) {
			String text = eachrow.getText();
			System.out.println(text);
		}

	}
		public static void toCell(String id) {
			 WebElement table = driver.findElement(By.id(id));
			List< WebElement> allcell = table.findElements(By.tagName("td"));
			for (WebElement eachcell : allcell) {
				String text = eachcell.getText();
				System.out.println(text);
			}

		}
			public static void toHeading(String id) {
				 WebElement table = driver.findElement(By.id(id));
				List< WebElement> allheads = table.findElements(By.tagName("th"));
				for (WebElement eachhead : allheads) {
					String text = eachhead.getText();
					System.out.println(text);

			}
	 
	 }
			 public static void toRowIndex(String id, Integer x) {
				 WebElement table = driver.findElement(By.id(id));
				List< WebElement> allrows = table.findElements(By.tagName("tr"));
				for (int i = 0; i < allrows.size(); i++) {
					if (i==x) {
						WebElement row = allrows.get(i);
						String text = row.getText();
						System.out.println(text);
					}				
				}
			}
			 public static void toCellIndex(String id, Integer x) {
				 WebElement table = driver.findElement(By.id(id));
				List< WebElement> allcells = table.findElements(By.tagName("td"));
				for (int i = 0; i < allcells.size(); i++) {
					if (i==x) {
						WebElement row = allcells.get(i);
						String text = row.getText();
						System.out.println(text);
					}				
				}
			}
			
			//particular row---particular data
			 public static void toRowCellIndex(String id, Integer x, Integer y) {
				 WebElement table = driver.findElement(By.id(id));
				List< WebElement> allrows = table.findElements(By.tagName("tr"));
				for (int i = 0; i < allrows.size(); i++) {
					if (i==x) {
						WebElement row = allrows.get(i);
						String text = row.getText();
						System.out.println(text);
						List<WebElement> alldatas = row.findElements(By.tagName("td"));
						for (int j = 0; j < alldatas.size(); j++) {
							if (j==y) {						
							
							WebElement data = alldatas.get(j);
							String text2 = data.getText();
							System.out.println(text2);
							}
						}
					}				
				}
			}
			
			
			 public static void toevencelldata(String id) {
				 WebElement table = driver.findElement(By.id(id));
				List< WebElement> allcells = table.findElements(By.tagName("td"));
				for (int i = 0; i < allcells.size(); i++) {
					if (i%2==0) {
						WebElement row = allcells.get(i);
						String text = row.getText();
						System.out.println(text);
					}				
				}
			}
			
			 public static void tooddcelldata(String id) {
				 WebElement table = driver.findElement(By.id(id));
				List< WebElement> allcells = table.findElements(By.tagName("td"));
				for (int i = 0; i < allcells.size(); i++) {
					if (i%2==1) {
						WebElement row = allcells.get(i);
						String text = row.getText();
						System.out.println(text);
					}				
				}
			}
			
			 public static void toevenrow(String id) {
				 WebElement table = driver.findElement(By.id(id));
				List< WebElement> allrows = table.findElements(By.tagName("tr"));
				for (int i = 0; i < allrows.size(); i++) {
					if (i%2==0) {
						WebElement row = allrows.get(i);
						String text = row.getText();
						System.out.println(text);
					}				
				}
			}
			
			 public static void tooddrow(String id) {
				 WebElement table = driver.findElement(By.id(id));
				List< WebElement> allrows = table.findElements(By.tagName("tr"));
				for (int i = 0; i < allrows.size(); i++) {
					if (i%2==1) {
						WebElement row = allrows.get(i);
						String text = row.getText();
						System.out.println(text);
					}				
				}
			}
			
			 public static void totablesize() {				
				 List< WebElement> alltables = driver.findElements(By.tagName("table"));
				 int size = alltables.size();
				 System.out.println("No of Tables:"+size);

			}
			 
			 //to print particular row/cell no
			 public static void toRowCellNo(String id, String z) {
				 WebElement table = driver.findElement(By.id(id));
				List< WebElement> allrows = table.findElements(By.tagName("tr"));
				for (int i = 0; i < allrows.size(); i++) {
					
						WebElement row = allrows.get(i);
						
						List<WebElement> alldatas = row.findElements(By.tagName("td"));
						for (int j = 0; j < alldatas.size(); j++) {
							WebElement data = alldatas.get(j);
							String text2 = data.getText();
							
							if (text2.startsWith(z)) {
								System.out.println("Text:"+text2);
								System.out.println("Row No:"+i);
								System.out.println("Cell No:"+j);
							
							
						}
					}				
				}
			}
			
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			
			
	 }
	 
	 

	 
	 
	 
	 
	 
	 
	 
	 	 


