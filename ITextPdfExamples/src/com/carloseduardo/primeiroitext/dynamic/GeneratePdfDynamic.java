package com.carloseduardo.primeiroitext.dynamic;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;	
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class GeneratePdfDynamic {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String file_name = "C:\\Users\\carlo\\OneDrive\\Documentos\\Relatorio-Sobras.pdf";
		Document doc = new Document(PageSize.A4.rotate(),0,0,0,0);

		try {
			PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream(file_name));

			doc.open();

			Image logo = Image.getInstance("C:\\Users\\carlo\\OneDrive\\Imagens\\logo_sky2.jpg");
			logo.scalePercent(20);
			logo.setAlignment(Element.ALIGN_CENTER);

			doc.add(logo);

			doc.add(new Paragraph(" "));
			doc.add(new Paragraph(" "));
			
			Paragraph title = new Paragraph("Relatório de Entradas e Saídas", new
					 Font(FontFamily.COURIER, 18, Font.BOLD, new BaseColor(0, 0, 0)));
			title.setAlignment(Element.ALIGN_CENTER);
			doc.add(title);
			
			doc.add(new Paragraph(" "));
			doc.add(new Paragraph(" "));
			
			PdfPTable table = new PdfPTable(10);
			table.setWidthPercentage(100);
 
			// Defina a largura das colunas
	        float[] columnWidths = {50f, 50f, 50f, 50f, 50f, 50f, 50f, 50f, 50f, 50f};
	        table.setWidths(columnWidths);

			Paragraph paragrafoTipo = new Paragraph("Tipo de Registro", new
					 Font(FontFamily.HELVETICA, 12f, Font.BOLD));
			title.setAlignment(Element.ALIGN_CENTER);
			
			Paragraph paragrafoNF = new Paragraph("N° Nota Fiscal", new
					 Font(FontFamily.HELVETICA, 12f, Font.BOLD));
			title.setAlignment(Element.ALIGN_CENTER);
			
			Paragraph paragrafoQtd = new Paragraph("Quantidade", new
					 Font(FontFamily.HELVETICA, 12f, Font.BOLD));
			title.setAlignment(Element.ALIGN_CENTER);
			
			Paragraph paragrafoTipoItem = new Paragraph("Tipo de Item", new
					 Font(FontFamily.HELVETICA, 12f, Font.BOLD));
			title.setAlignment(Element.ALIGN_CENTER);
			
			Paragraph paragrafoDescItem = new Paragraph("Descrição do Item", new
					 Font(FontFamily.HELVETICA, 12f, Font.BOLD));
			title.setAlignment(Element.ALIGN_CENTER);
			
			Paragraph paragrafoMarca = new Paragraph("Marca", new
					 Font(FontFamily.HELVETICA, 12f, Font.BOLD));
			title.setAlignment(Element.ALIGN_CENTER);
			
			Paragraph paragrafoObra = new Paragraph("Obra", new
					 Font(FontFamily.HELVETICA, 12f, Font.BOLD));
			title.setAlignment(Element.ALIGN_CENTER);
			
			Paragraph paragrafoUsuario = new Paragraph("Usuario", new
					 Font(FontFamily.HELVETICA, 12f, Font.BOLD));
			title.setAlignment(Element.ALIGN_CENTER);
			
			Paragraph paragrafoTipoUsuario = new Paragraph("Tipo do Usuário", new
					 Font(FontFamily.HELVETICA, 12f, Font.BOLD));
			title.setAlignment(Element.ALIGN_CENTER);
			
			Paragraph paragrafoDataRegis = new Paragraph("Data do Registro", new
					 Font(FontFamily.HELVETICA, 12f, Font.BOLD));
			title.setAlignment(Element.ALIGN_CENTER);
			
			PdfPCell tipoRegistro = new PdfPCell(paragrafoTipo);
			PdfPCell notaFiscal = new PdfPCell(paragrafoNF);
			PdfPCell quantidade = new PdfPCell(paragrafoQtd);
			PdfPCell tipoItem = new PdfPCell(paragrafoTipoItem);
			PdfPCell descricao = new PdfPCell(paragrafoDescItem);
			PdfPCell marca = new PdfPCell(paragrafoMarca);
			PdfPCell obra = new PdfPCell(paragrafoObra);
			PdfPCell usuario = new PdfPCell(paragrafoUsuario);
			PdfPCell tipoUsuario = new PdfPCell(paragrafoTipoUsuario);
			PdfPCell dataRegis = new PdfPCell(paragrafoDataRegis);
			
			table.addCell(tipoRegistro);
			table.addCell(notaFiscal);
			table.addCell(quantidade);
			table.addCell(tipoItem);
			table.addCell(descricao);
			table.addCell(marca);
			table.addCell(obra);
			table.addCell(usuario);
			table.addCell(tipoUsuario);
			table.addCell(dataRegis);

			table.setHeaderRows(1);

			try {
				DBConnection obJDBConnection = new DBConnection();
				Connection con = obJDBConnection.getConnection();
				PreparedStatement ps = con.prepareStatement(
						"SELECT *\r\n"
						+ "FROM (\r\n"
						+ "    SELECT 'entrada' AS tipo, registroentrada.numNotaEntrada, registroentrada.qtdEntrada AS quantidade, item.descricaoItem, tipoitem.nometipoitem, marca.nomeMarca, obra.nomeobra, usuario.nomeUsuario, tipousuario.nomeTipoUsuario, registroentrada.dataEntrada as data\r\n"
						+ "    FROM registroentrada\r\n"
						+ "    INNER JOIN item ON registroentrada.codItem = item.codItem\r\n"
						+ "    INNER JOIN tipoitem ON item.codTipoItem = tipoitem.codTipoItem\r\n"
						+ "    INNER JOIN marca ON item.codMarca = marca.codMarca\r\n"
						+ "    INNER JOIN obra ON registroentrada.codObra = obra.codObra\r\n"
						+ "    INNER JOIN usuario ON registroentrada.codUsuario = usuario.codUsuario\r\n"
						+ "    INNER JOIN tipousuario ON usuario.codTipoUsuario = tipousuario.codTipoUsuario\r\n"
						+ "    UNION\r\n"
						+ "    SELECT 'saida' AS tipo,registrosaida.numNotaSaida, registrosaida.qtdSaida AS quantidade, item.descricaoItem, tipoitem.nometipoitem, marca.nomeMarca, obra.nomeobra, usuario.nomeUsuario, tipousuario.nomeTipoUsuario, registrosaida.dataSaida as data\r\n"
						+ "    FROM registrosaida\r\n"
						+ "    INNER JOIN item ON registrosaida.codItem = item.codItem\r\n"
						+ "    INNER JOIN tipoitem ON item.codTipoItem = tipoitem.codTipoItem\r\n"
						+ "    INNER JOIN marca ON item.codMarca = marca.codMarca\r\n"
						+ "    INNER JOIN obra ON registrosaida.codObra = obra.codObra\r\n"
						+ "    INNER JOIN usuario ON registrosaida.codUsuario = usuario.codUsuario\r\n"
						+ "    INNER JOIN tipousuario ON usuario.codTipoUsuario = tipousuario.codTipoUsuario\r\n"
						+ ") AS combined_result\r\n"
						+ "WHERE combined_result.data BETWEEN '2023-11-30 16:28:11' AND '2023-12-01 10:12:41'\r\n"
						+ "ORDER BY combined_result.data;");
				ResultSet rs = ps.executeQuery();

				while (rs.next()) {
					table.addCell(rs.getString("tipo"));
					table.addCell(rs.getString("numNotaEntrada"));
					table.addCell(rs.getString("quantidade"));
					table.addCell(rs.getString("nomeTipoItem"));
					table.addCell(rs.getString("descricaoItem"));
					table.addCell(rs.getString("nomeMarca"));
					table.addCell(rs.getString("nomeObra"));
					table.addCell(rs.getString("nomeUsuario"));
					table.addCell(rs.getString("nomeTipoUsuario"));
					java.sql.Date data = rs.getDate("data");
					PdfPCell cell = new PdfPCell();
					cell.addElement(new com.itextpdf.text.Phrase(data.toString()));
					table.addCell(cell);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			doc.add(table);

			doc.close();
			writer.close();

			System.out.println("PDF criado!");
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
