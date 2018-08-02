<h1>Java FileManager</h1>
<p>
	Implementación de rutinas para gestionar archivos.
</p>

<div>
	<h3>Dependencias</h3>
	<ul>
		<li><strong>jsch-0.1.54.jar</strong> usado para el tratamiento SFTP.</li>
	</ul>
</div>

<div>
	<h3>Consideraciones</h3>
	<ul>
		<li>El archivo <strong>FileManager-1.0-jar-with-dependencies.jar</strong> incluye las dependencias.</li>
	</ul>
</div>

<br><br>

<div>
	<h3>Clase FileSystem</h3>
	<p>
		Implementación de operaciones sobre archivos en el File System de la PC.
	</p>
	<table>
		<thead>
			<tr>
				<th>Método</th>
				<th>Descripción</th>
				<th>Parámetros</th>
				<th>Retorno</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>cp</td>
				<td>
					Metodo para copiar un archivo.
				</td>
				<td>
					<div>
						<strong>String pathNameSource</strong>
						<p>
							Ruta y nombre de archivo que se desea copiar.
						</p>
					</div>
					<div>
						<strong>String pathNameDest</strong>
						<p>
							Ruta y nombre del archivo donde será copiado.
						</p>
					</div>
				</td>
				<td>
					<strong>boolean</strong>
					<p>
						Identifica si el archivo fue copiado.
					</p>
				</td>
			</tr>

			<tr>
				<td>mv</td>
				<td>
					Metodo para mover un archivo.
				</td>
				<td>
					<div>
						<strong>String sourceFile</strong>
						<p>
							Ruta y nombre de archivo que se desea mover.
						</p>
					</div>
					<div>
						<strong>String destFile</strong>
						<p>
							Ruta y nombre del archivo donde será movido.
						</p>
					</div>
				</td>
				<td>
					<strong>boolean</strong>
					<p>
						Identifica si el archivo fue movido.
					</p>
				</td>
			</tr>

			<tr>
				<td>rm</td>
				<td>
					Metodo para borrar un archivo.
				</td>
				<td>
					<strong>String pathName</strong>
					<p>
						Ruta y nombre de archivo a borrar.
					</p>
				</td>
				<td>
					<strong>boolean</strong>
					<p>
						Identifica si el archivo fue borrado.
					</p>
				</td>
			</tr>

			<tr>
				<td>ls</td>
				<td>
					Metodo que lista los archivos y carpetas de una ruta especifica.
				</td>
				<td>
					<div>
						<strong>String path</strong>
						<p>
							Ruta donde se buscarán los archivos y carpetas.
						</p>
					</div>
				</td>
				<td>
					<strong>String[]</strong>
					<p>
						Array de <strong>String</strong> con los nombres de archivos encontrados.
					</p>
				</td>
			</tr>
		</tbody>
	</table>
</div>

<br><br>

<div>
	<h3>Clase FileSFTP</h3>
	<p>
		Implemenatación de operaciones para transferencia de archivos a través de SFTP.
	</p>
	<table>
		<thead>
			<tr>
				<th>Método</th>
				<th>Descripción</th>
				<th>Parámetros</th>
				<th>Retorno</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>FileSFTP</td>
				<td>
					Constructor.
				</td>
				<td>
					<div>
						<strong>String host</strong>
						<p>
							Ip o nombre del equipo con el servidor SFTP.
						</p>
					</div>
					<div>
						<strong>int port</strong>
						<p>
							Número de puerto del servidor SFTP.
						</p>
					</div>
					<div>
						<strong>String user</strong>
						<p>
							Usuario de acceso al servidor SFTP.
						</p>
					</div>
					<div>
						<strong>String password</strong>
						<p>
							Password de acceso al servidor SFTP.
						</p>
					</div>
				</td>
				<td></td>
			</tr>
			<tr>
				<td>connect</td>
				<td>
					Establece conexión con el servidor SFTP.
				</td>
				<td>
					Sin parámetros.
				</td>
				<td>
					void
				</td>
			</tr>
			<tr>
				<td>disconect</td>
				<td>
					Termina la conexión con el servidor SFTP.
				</td>
				<td>
					Sin parámetros.
				</td>
				<td>
					void
				</td>
			</tr>
			<tr>
				<td>isConected</td>
				<td>
					Verifica si se encuentra conectado al servidor SFTP.
				</td>
				<td>
					Sin parámetros.
				</td>
				<td>
					<strong>boolean</strong>
					<p>
						true, si se encuentra conectado al servidor SFTP.
					</p>
				</td>
			</tr>
			<tr>
				<td>put</td>
				<td>
					Metodo para cargar un archivo al servidor SFTP.
				</td>
				<td>
					<div>
						<strong>String filePath</strong>
						<p>
							Ruta y nombre del archivo en el FileSystem de la PC.
						</p>
					</div>
					<div>
						<strong>String ftpPath</strong>
						<p>
							Ruta y nombre del archivo en el servidor SFTP, dónde se subirá el archivo.
						</p>
					</div>
				</td>
				<td>
					<strong>boolean</strong>
					<p>
						Identifica si el archivo fue cargado al servidor SFTP.
					</p>
				</td>
			</tr>
			<tr>
				<td>get</td>
				<td>
					Metodo para descargar un archivo del servidor SFTP.
				</td>
				<td>
					<div>
						<strong>String ftpPath</strong>
						<p>
							Ruta y nombre del archivo en el servidor SFTP, de donde se descargará el archivo.
						</p>
					</div>
					<div>
						<strong>String filePath</strong>
						<p>
							Ruta y nombre del archivo donde será descargado en la PC.
						</p>
					</div>
				</td>
				<td>
					<strong>boolean</strong>
					<p>
						Identifica si el archivo fue descargado al servidor SFTP.
					</p>
				</td>
			</tr>
			<tr>
				<td>ls</td>
				<td>
					Metodo que lista los archivos y carpetas en el servidor SFTP.
				</td>
				<td>
					<strong>String path</strong>
					<p>
						Ruta donde se buscarán los archivos y carpetas en el servidor SFTP.
					</p>
				</td>
				<td>
					<strong>String[]</strong>
					<p>
						Array de <strong>String</strong> con los nombres de archivos encontrados.
					</p>
				</td>
			</tr>
		</tbody>
	</table>
</div>