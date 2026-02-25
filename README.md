# 📧 N8N OUTLOOK - Automatización de Citas Médicas

Proyecto de automatización n8n para gestión de citas médicas vía Outlook desarrollado por **Isaac Esteban Haro Torres**.

---

## 📝 Descripción

Flujo de n8n que lee correos entrantes de Microsoft Outlook con asunto "Cita médica", extrae los datos del paciente (nombre, fecha, hora, tipo de consulta) y los guarda en Google Sheets. Opcionalmente envía confirmación al paciente por Telegram.

---

## ✨ Características

- Trigger de correos entrantes en Outlook
- Filtrado por asunto "Cita médica"
- Extracción automática de datos del correo
- Guardado en Google Sheets
- Notificación opcional por Telegram
- Completamente dockerizado

---

## 🛠️ Stack Tecnológico

- n8n (última versión)
- Docker
- Google Sheets API
- Microsoft Outlook API
- Telegram Bot API

---

## 🚀 Uso

### 1. Configurar credenciales

Crear archivo `.env` con las siguientes variables:

```env
# Credenciales n8n
N8N_USER=admin
N8N_PASSWORD=tu_password_seguro
N8N_HOST=localhost
WEBHOOK_URL=http://localhost:5678

# Google Sheets
GOOGLE_SHEETS_CLIENT_ID=tu_client_id
GOOGLE_SHEETS_CLIENT_SECRET=tu_client_secret
GOOGLE_SHEETS_REDIRECT_URI=http://localhost:5678/oauth2/callback

# Telegram
TELEGRAM_BOT_TOKEN=tu_bot_token
```

### 2. Levantar contenedor

```bash
docker-compose up -d
```

### 3. Acceder a n8n

- URL: http://localhost:5678
- Usuario: admin
- Contraseña: la que configures en .env

### 4. Importar flujo

1. En la UI de n8n, hacer clic en "Import from File"
2. Seleccionar el archivo `workflow.json`
3. Configurar las credenciales en n8n

### 5. Configurar credenciales en n8n

- **Outlook**: Credentials → New → Outlook OAuth2 → Autenticar con cuenta Microsoft
- **Google Sheets**: Credentials → New → Google Sheets OAuth2 → Autenticar
- **Telegram**: Credentials → New → Telegram API → Ingresar Bot Token

---

## 📋 Formato esperado del correo

```
Asunto: Cita médica

Paciente: Juan Pérez
Fecha: 25/02/2026
Hora: 10:00
Tipo de consulta: Revisión general
```

---

## 👨‍💻 Desarrollado por Isaac Esteban Haro Torres

**Ingeniero en Sistemas · Full Stack · Automatización · Data**

- 📧 Email: zackharo1@gmail.com
- 📱 WhatsApp: 098805517
- 💻 GitHub: https://github.com/ieharo1
- 🌐 Portafolio: https://ieharo1.github.io/portafolio-isaac.haro/

---

© 2026 Isaac Esteban Haro Torres - Todos los derechos reservados.
